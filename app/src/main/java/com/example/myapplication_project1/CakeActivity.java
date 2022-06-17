package com.example.myapplication_project1;


import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;


@SuppressWarnings("deprecation")
public class CakeActivity extends TabActivity {


    Button twosome1, twosome2, twosome3, twosome4, twosome5, twosome6, twosome7, twosome8, twosome9, twosome10;
    Button star1, star2, star3, star4, star5, star6;
    Button paris1, paris2, paris3, paris4, paris5, paris6, paris7, paris8, paris9, paris10;
    Button tous1, tous2, tous3, tous4, tous5, tous6, tous7, tous8, tous9, tous10;
    Button baskin1, baskin2, baskin3, baskin4, baskin5, baskin6, baskin7, baskin8, baskin9, baskin10;
    Button hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel9, hotel10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);

        // 버튼 아이디

        twosome1 = findViewById(R.id.Two_info1); twosome2 = findViewById(R.id.Two_info2);
        twosome3 = findViewById(R.id.Two_info3); twosome4 = findViewById(R.id.Two_info4);
        twosome5 = findViewById(R.id.Two_info5); twosome6 = findViewById(R.id.Two_info6);
        twosome7 = findViewById(R.id.Two_info7); twosome8 = findViewById(R.id.Two_info8);
        twosome9 = findViewById(R.id.Two_info9); twosome10 = findViewById(R.id.Two_info10);

        star1 = findViewById(R.id.star_info1); star2 = findViewById(R.id.star_info2);
        star3 = findViewById(R.id.star_info3); star4 = findViewById(R.id.star_info4);
        star5 = findViewById(R.id.star_info5); star6 = findViewById(R.id.star_info6);

        paris1 = findViewById(R.id.paris_info1); paris2 = findViewById(R.id.paris_info2);
        paris3 = findViewById(R.id.paris_info3); paris4 = findViewById(R.id.paris_info4);
        paris5 = findViewById(R.id.paris_info5); paris6 = findViewById(R.id.paris_info6);
        paris7 = findViewById(R.id.paris_info7); paris8 = findViewById(R.id.paris_info8);
        paris9 = findViewById(R.id.paris_info9); paris10 = findViewById(R.id.paris_info10);

        tous1 = findViewById(R.id.tous_info1); tous2 = findViewById(R.id.tous_info2);
        tous3 = findViewById(R.id.tous_info3); tous4 = findViewById(R.id.tous_info4);
        tous5 = findViewById(R.id.tous_info5); tous6 = findViewById(R.id.tous_info6);
        tous7 = findViewById(R.id.tous_info7); tous8 = findViewById(R.id.tous_info8);
        tous9 = findViewById(R.id.tous_info9); tous10 = findViewById(R.id.tous_info10);

        baskin1 = findViewById(R.id.baskin_info1); baskin2 = findViewById(R.id.baskin_info2);
        baskin3 = findViewById(R.id.baskin_info3); baskin4 = findViewById(R.id.baskin_info4);
        baskin5 = findViewById(R.id.baskin_info5); baskin6 = findViewById(R.id.baskin_info6);
        baskin7 = findViewById(R.id.baskin_info7); baskin8 = findViewById(R.id.baskin_info8);
        baskin9 = findViewById(R.id.baskin_info9); baskin10 = findViewById(R.id.baskin_info10);

        hotel1 = findViewById(R.id.hotel_info1); hotel2 = findViewById(R.id.hotel_info2);
        hotel3 = findViewById(R.id.hotel_info3); hotel4 = findViewById(R.id.hotel_info4);
        hotel5 = findViewById(R.id.hotel_info5); hotel6 = findViewById(R.id.hotel_info6);
        hotel7 = findViewById(R.id.hotel_info7); hotel8 = findViewById(R.id.hotel_info8);
        hotel9 = findViewById(R.id.hotel_info9); hotel10 = findViewById(R.id.hotel_info10);


        // 투썸
        {
            twosome1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 고구마 밀크 생크림");
                    dlg.setMessage("달콤하고 묵직한 고구마 무스 크림과 담백한 생크림의 조화로 남녀노소 누구나 맛있게 즐길 수 있는 고구마 생크림 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 딸기 생크림");
                    dlg.setMessage("담백한 생크림과 부드러운 시트, 딸기와 블루베리 등 상큼한 과일을 풍성하게 올린 생크림 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 미라클 윈터 파티");
                    dlg.setMessage("부드러운 초콜릿 무스 위에 향긋한 유자 크림과 유자청을 바른 초코시트를 쌓고 크로캉과 초코 크런치볼로 바삭한 식감을 살린 2단 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 윈터 보니밤 케이크");
                    dlg.setMessage("보늬밤을 넣은 진한 밤크림에 치즈크림을 레이어하고, 산딸기잼과 함께 바삭한 머랭쿠키를 더해 더욱 풍성한 식감을 느낄 수 있는 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 미라클 초콜릿 무스");
                    dlg.setMessage("초코 시트에 초콜릿, 카라멜, 오렌지의 세 가지 무스를 레이어하고, 카라멜 크런치로 바삭한 식감을 살린 시즌 대표 무스케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 화이트 포레스트 생크림");
                    dlg.setMessage("딸기 생크림 케이크 위에 달콤한 화이트컬 초콜릿과 드라이 라즈베리를 올려 상큼하고 부드럽게 즐기는 생크림 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 트리플 베리 생크림");
                    dlg.setMessage("블루베리, 라즈베리, 스트로베리를 마스카포네 생크림과 함께 즐길 수 있는 새콤달콤한 생크림 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 마이 투썸 하트");
                    dlg.setMessage("투썸의 베스트 케이크를 모두 함께 맛볼 수 있는 다채로운 조합의 홀케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 스트로베리 초콜릿 생크림");
                    dlg.setMessage("한가득 올린 상큼한 딸기, 크런치 초코볼이 알알이 씹히는 진한 초콜릿 생크림 시트가 조화를 이루는 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            twosome10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("투썸 플레이스 : 마스카포네 생크림");
                    dlg.setMessage("하얀 케이크 시트 속에 마스카포네 생크림과 딸기가 어우러져 새콤달콤하게 즐길 수 있는 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });


        }





        //스타벅스
        {
            star1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                dlg.setTitle("스타벅스 : 딸기 듬뿍 마스카포네 케이크");
                dlg.setMessage("두 겹의 케이크 시트 사이에 진한 마스카포네 크림을 넣고 신선하고 달콤한 설향 딸기를 듬뿍 올린 떠먹는 케이크입니다.");
                dlg.setPositiveButton("확인", (dialog, which) -> {
                });
                dlg.show();
            }
        });

            star2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("스타벅스 : 산타 벨벳 체커스 케이크");
                    dlg.setMessage("체크 형태로 번간알 쌓은 레드 벨벳 시트와 화이트 케이크 시트 사이에 진한 크림 치즈를 듬뿍 넣은 후 산타 베어리스타 초콜릿으로 장식한 레드벨벳케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            star3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("스타벅스 : 부드러운 고구마 생크림 케이크");
                    dlg.setMessage("달콤하고 고소한 고구마 무스를 케이크 시트 사이에 겹겹이 넣은 후 생크림과 카스텔라 크럼블을 올리고 루돌프 베어리스타 초콜릿으로 장식한 부드러운 고구마 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            star4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("스타벅스 : 크런치 가나슈 레이어 케이크");
                    dlg.setMessage("12겹의 다양한 크림과 케이크 시트가 진한 맛을 내고 크런치한 식감의 초콜릿 볼과 아몬드가 씹는 즐거움을 주는 달콤한 초콜릿 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            star5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("스타벅스 : 슈크림 트리 바움쿠헨");
                    dlg.setMessage("한 겹 한 겹 정성스럽게 구운 바움쿠헨 안에 바닐라빈을 넣은 슈크림과 부드러운 케이크 시트를 넣은 크리스마스 트리 모양의 바움쿠헨 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            star6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("스타벅스 : 티라미수 부쉬 드 노엘");
                    dlg.setMessage("다크 코코아 롤 케이크 시트에 커피 시럽과 고소한 마스카포네 크림을 넣은 후 달콤한 다크 가나슈로 겉면을 코팅한 통나무 모양의 티라미수 롤 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });
        }

        // 파리바게트
        {
            paris1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 메리크리스마스 치즈");
                    dlg.setMessage("심플한 크리스마스 픽으로 장식하여 온 가족과 함께 즐기기 좋은 진한 치즈 풍미의 치즈케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 블레싱 레드베리 스페셜");
                    dlg.setMessage("고급스러운 디자인에 크리스마스 파티 분위기를 빛내 줄 포인세티아를 닮은 크리스마스 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 위싱 트리");
                    dlg.setMessage("크리스마스의 행복한 바램을 담은 트리를 표현한 딸기콩포트와 생크림이 어우러진 입체 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 산타 이즈 벡");
                    dlg.setMessage("크리스마스 산타를 모티브로 한 딸기콩포트와 생크림이 어우러진 입체 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 산타는 딸기 루돌프는 초코");
                    dlg.setMessage("달콤한 초코케이크와 상큼한 딸기 생크림 케이크를 한 번에 즐길 수 있는 크리스마스 반반 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 호호호 루돌프");
                    dlg.setMessage("호호호 산타와 함께 찾아온 루돌프, 크리스마스와 어울리는 컬러감을 더해 분위기가 물씬 나는 초코 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 호호호 산타");
                    dlg.setMessage("크리스마스에 돌아온 호호호 산타, 크리스마스와 어울리는 컬러감을 더해 분위기가 물씬 나는 초코 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 징글벨 징글벨");
                    dlg.setMessage("크리스마스를 상징하는 징글벨 종모양 케이크를 산타가 직접 완성시키는 위트 있는 컨셉의 초코 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 크리스마스 레드벨벳");
                    dlg.setMessage("설원의 루돌프와 산타를 표현해 크리스마스 분위기가 물씬 풍기를 레드벨벳 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            paris10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파리바게트 : 화이트 크리스마스 티라미수");
                    dlg.setMessage("눈 내린 크리스마스의 겨울밤을 표현한 진하고 향긋한 티라미수 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });
        }

        //뚜레쥬르
        {
            tous1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 해피해피 스노우맨");
                    dlg.setMessage("화이트시트 사이 캬라멜 크림, 초코 크런치 크림이 달콤하게 어우러진 귀여운 해피해피 스노우맨 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 백설공주와 달콤한 사과");
                    dlg.setMessage("고소한 시트에 사과 요거트 크림을 샌드하고 달콤한 애플 리플잼을 넣은 백설공주 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 파티 싼타 케이크");
                    dlg.setMessage("두 가지 초콜릿 시트 사이에 고소한 헤이즐넛 크림이 샌드되고 초코 크런치로 재밌는 식감을 살린 파티 싼타 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 힙스터 루돌프 케이크");
                    dlg.setMessage("초코시트, 초코크림 사이에 초코 크런치를 샌드한 크리스마스 파티의 주인공 힙스터 루돌프 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 크리스마스 브라우니 쿠키 리스");
                    dlg.setMessage("화려한 크리스마스 리스, 브라우니&쿠키 장식의 달콤한 초코 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 용감한 쿠키 캬라멜 마스카포네 생크림 케이크");
                    dlg.setMessage("캬라멜 마스카포네 크림과 쿠키 크럼블이 부드럽게 어우러진 쿠키런 대표 시즌 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 체리 초코 케이크 캐슬");
                    dlg.setMessage("촉촉 달콤 초코 맛, 새콤 달콤 체리 맛의 퐁 드 파티세리 케이크 위에 귀여운 딸기맛 쿠키 클레이로 장식된 체리 초코 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 쿠키런 통나무 롤케이크");
                    dlg.setMessage("진한 초코 가냐수 & 초코 크림이 샌드 된 부드러운 롤케이크에 진한 초코 크림을 아이싱한 통나무 롤케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 쿠키런 초코 골드 레이어");
                    dlg.setMessage("진정한 초코 맛! 붇러운 초코와 화이트 시트 속 두 가지 맛 초코 크림이 더해진 쿠키런 대표 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            tous10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("뚜레쥬르 : 엘사 올라프 초코 스트로베리 케이크");
                    dlg.setMessage("딸기와 초코맛 케이크를 동시에 즐기는 겨울 왕국 스페셜 에디션 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });
        }

        //베스킨 라빈스
        {
            baskin1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 뽀로로의 크리스마스 파티");
                    dlg.setMessage("뉴욕 치즈 케이크, 레인보우 샤베트, 아몬드 봉봉, 엄마는 외계인, 바나나");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 화이트 트리");
                    dlg.setMessage("체리 쥬빌레, 초콜릿, 슈팅 스타, 민트 초콜릿 칩, 아몬드 봉봉, 이상한 나라의 솜사탕, 엄마는 외계인");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 파티 위드 해피박스");
                    dlg.setMessage("체리 쥬빌레, 뉴욕 치즈케이크, 레인보우 샤베트, 슈팅스타, 민트 초콜릿칩, 베리베리 스트로베리, 아몬드 봉봉, 이상한 나라의 솜사탕, 엄마는 외계인");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 골라먹는 스노우볼");
                    dlg.setMessage("체리쥬빌레, 레인보우 샤베트, 슈팅스타, 민트 초콜릿 칩, 베리베리 스트로베리, 아몬드 봉봉, 엄마는 외계인, 바나나");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 초코초코 부쉬드노엘");
                    dlg.setMessage("체리쥬빌레, 뉴욕 치즈케이크, 초콜릿");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 흰 눈 사이로 설렘을 타고");
                    dlg.setMessage("뉴욕 치즈케이크, 슈팅스타, 베리베리 스트로베리, 아몬드 봉봉, 엄마는 외계인");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 엘사와 노크의 겨울왕국");
                    dlg.setMessage("체리쥬빌레, 레인보우 샤베트, 슈팅스타, 민트 초콜릿칩, 아몬드 봉봉, 엄마는 외계인");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 빨간코 루돌프");
                    dlg.setMessage("초콜릿, 베리베리 스트로베리");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 파티 위드 트윙클 트리");
                    dlg.setMessage("체리쥬빌레, 뉴욕 치즈케이크, 슈팅스타, 민트 초콜릿칩, 베리베리 스트로베리, 아몬드 봉봉, 이상한 나라의 솜사탕, 엄마는 외계인");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            baskin10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("베스킨라빈스 : 선물을 전하는 산타 썰매");
                    dlg.setMessage("뉴욕 치즈 케이크, 레인보우 샤베트, 슈팅스타, 민트 초콜릿칩, 베리베리 스트로베리, 아몬드 봉봉, 31요거트, 이상한 나라의 솜사탕, 엄마는 외계인, 바나나");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });
        }

        //호텔
        {
            hotel1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("밀레니엄 힐튼 서울 : 화이트 시폰 트리 케이크");
                    dlg.setMessage("새콤달콤한 블루베리가 가득, 폭신하고 부드러운 블루베리 시폰 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("밀레니엄 힐튼 서울 : 발로나 다크 초콜릿 돔 무스 케이크");
                    dlg.setMessage("부드러운 발로나 다크 초콜릿 무스 사이에 상큼한 오렌지 젤리가 가득 담긴 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("웨스트 조선 : Happy Pine Tree Cake");
                    dlg.setMessage("초록색을 활용해 전통 크리스마스 트리를 표현한 제품으로 화이트 초콜릿에 녹차 쇼콜라를 더한 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("웨스트 조선 : White Snow Cake");
                    dlg.setMessage("눈 덮인 크리스마스 트리를 형상화한 제품으로, 초콜릿 시트에 마스카포네 생크림이 어우러진 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파라다이스 시티 인천 : 딸기 트리");
                    dlg.setMessage("가든 카페 크리스마스 시그니처 케이크! 입 안에서 사르르 녹는 하얀 생크림 사이로 빨간 제철 딸기가 어우러진 달콤한 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("파라다이스 시티 인천 : 진저 하우스");
                    dlg.setMessage("크리스마스 향기가 가득한 진저 하우스! 쿠키 하우스 안에 초콜릿과 수제 쿠키, 젤리로 가득한 파라다이스의 프리미엄 진저 하우스 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("포시즌스 서울 : 흑임자 바닐라 케이크");
                    dlg.setMessage("흑임자 스펀지, 흑임자 크런키, 바닐라 무스, 흑임자 가나슈");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("포시즌스 서울 : 블랙 포레스트");
                    dlg.setMessage("초코 스펀지, 체리 마멀레이드, 초콜릿 무스, 초콜릿 레이어드, 체리펄");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("jw 메리어트 동대문 : 둘세 초콜릿 몽블랑");
                    dlg.setMessage("프랑스 둘세 초콜릿을 이용한 부드러운 무스크림으로 트리 모양을 형상화한 케이크로 파리브레스트에 둘세초콜릿 크림 얼그레이파운드 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });

            hotel10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(CakeActivity.this);
                    dlg.setTitle("jw 메리어트 동대문 : 블랙 포레스트 케이크");
                    dlg.setMessage("부드러운 초코 스펀지, 진한 초콜릿 베이스와, 사워체리를 이용한 동대문 메리어트의 시그니처 케이크입니다.");
                    dlg.setPositiveButton("확인", (dialog, which) -> {
                    });
                    dlg.show();
                }
            });
        }



        // 탭 호스트

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecBrand = tabHost.newTabSpec("Brand").setIndicator("브랜드별");
        tabSpecBrand.setContent(R.id.tab_brand);
        tabHost.addTab(tabSpecBrand);

        TabHost.TabSpec tabSpecFlavor = tabHost.newTabSpec("Flavor").setIndicator("맛별");
        tabSpecFlavor.setContent(R.id.tab_flavor);
        tabHost.addTab(tabSpecFlavor);

        TabHost.TabSpec tabSpecBest = tabHost.newTabSpec("Best").setIndicator("베스트");
        tabSpecBest.setContent(R.id.tab_best);
        tabHost.addTab(tabSpecBest);

        TabHost.TabSpec tabSpecPrice = tabHost.newTabSpec("Price").setIndicator("가격별");
        tabSpecPrice.setContent(R.id.tab_price);
        tabHost.addTab(tabSpecPrice);

        tabHost.setCurrentTab(0);
    }


}