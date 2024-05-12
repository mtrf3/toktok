package X;

import Y.ARunnableS15S0101000_11;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.InsertItemParamsKt;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FVk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39080FVk implements InterfaceC39076FVg<FeedItemList> {
    public FeedItemList LIZ;
    public volatile C10K LIZIZ;
    public FutureTask<FeedItemList> LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;

    @Override // X.InterfaceC39076FVg
    public final void LIZIZ() {
        this.LJ = true;
    }

    @Override // X.InterfaceC39076FVg
    public final FeedItemList getData() {
        FeedItemList feedItemList = this.LIZ;
        if (feedItemList != null) {
            this.LIZIZ = null;
            this.LIZ = null;
            C56662Kg.LIZ().LIZLLL(1L, "feed_response_from_nuj_preload");
            return feedItemList;
        }
        if (this.LIZIZ == null) {
            return null;
        }
        if (!this.LIZIZ.LJIILIIL()) {
            try {
                this.LIZIZ.LJIJI();
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            if (this.LIZIZ.LJIILJJIL()) {
                C16880lQ.LLLLIIL(this.LIZIZ.LJIIJ());
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        FeedItemList feedItemList2 = this.LIZ;
        this.LIZIZ = null;
        this.LIZ = null;
        return feedItemList2;
    }

    @Override // X.InterfaceC39076FVg
    public final void LIZ(Object... objArr) {
        final String str;
        final String str2;
        final String str3;
        final String str4;
        final String str5;
        final String str6;
        if (!this.LIZLLL) {
            synchronized (this) {
                if (!this.LIZLLL) {
                    this.LIZLLL = true;
                    final int i = 0;
                    try {
                        if (objArr.length > 0 && (objArr[0] instanceof String) && (C33710DKw.LIZJ() || ((Boolean) DVO.LIZ.getValue()).booleanValue())) {
                            str2 = (String) objArr[0];
                            try {
                                str = (String) objArr[1];
                                try {
                                    str3 = (String) objArr[2];
                                    try {
                                        str4 = (String) objArr[3];
                                        try {
                                            str5 = (String) objArr[4];
                                        } catch (Exception unused) {
                                            str5 = null;
                                            str6 = null;
                                            this.LIZIZ = C10K.LIZIZ(new Callable() { // from class: X.FVl
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    final int i2;
                                                    boolean z;
                                                    FeedItemList LIZLLL;
                                                    final C39080FVk c39080FVk = C39080FVk.this;
                                                    final String str7 = str2;
                                                    final String str8 = str;
                                                    final String str9 = str3;
                                                    final String str10 = str4;
                                                    final String str11 = str5;
                                                    final int i3 = i;
                                                    final String str12 = str6;
                                                    c39080FVk.getClass();
                                                    EF7.LIZIZ();
                                                    try {
                                                        if (C2NU.LIZ.LIZIZ()) {
                                                            if (c39080FVk.LJ) {
                                                                c39080FVk.LJ = false;
                                                            } else {
                                                                if (C1A7.LJIILIIL().LIZ(0, "cold_start_times") <= 1) {
                                                                    i2 = 4;
                                                                } else {
                                                                    i2 = 0;
                                                                }
                                                                System.currentTimeMillis();
                                                                C56662Kg.LIZ().LJFF("app_start_to_preload_first_request", false);
                                                                C56662Kg.LIZ().LIZJ("cold_boot_first_request_to_get_did", false);
                                                                if (E3T.LIZ() == E3T.LIZIZ) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (z && c39080FVk.LIZJ == null) {
                                                                    FutureTask<FeedItemList> futureTask = new FutureTask<>(new Callable() { // from class: X.FVo
                                                                        @Override // java.util.concurrent.Callable
                                                                        public final Object call() {
                                                                            C39080FVk c39080FVk2 = C39080FVk.this;
                                                                            int i4 = i2;
                                                                            String str13 = str7;
                                                                            String str14 = str8;
                                                                            String str15 = str9;
                                                                            String str16 = str10;
                                                                            String str17 = str11;
                                                                            int i5 = i3;
                                                                            String str18 = str12;
                                                                            c39080FVk2.getClass();
                                                                            return C39080FVk.LIZLLL(i4, i5, str13, str14, str15, str16, str17, str18);
                                                                        }
                                                                    });
                                                                    c39080FVk.LIZJ = futureTask;
                                                                    futureTask.run();
                                                                    try {
                                                                        LIZLLL = c39080FVk.LIZJ.get(8000L, TimeUnit.MILLISECONDS);
                                                                    } catch (Exception unused2) {
                                                                        LIZLLL = FW5.LJFF(E3T.LIZIZ());
                                                                        FW5.LJIIIZ("no_preload_repsonse", "");
                                                                    }
                                                                    FFX.LIZ("new_user_fallback", "data_preload_type");
                                                                } else {
                                                                    if (!C39082FVm.LIZLLL.LIZ.containsKey("data_preload_type")) {
                                                                        FFX.LIZ("data_type_preload_other", "data_preload_type");
                                                                    }
                                                                    LIZLLL = C39080FVk.LIZLLL(i2, i3, str7, str8, str9, str10, str11, str12);
                                                                }
                                                                if (((Boolean) C94M.LIZJ.getValue()).booleanValue()) {
                                                                    Thread.sleep(((Number) C94M.LIZIZ.getValue()).longValue());
                                                                }
                                                                C46364IHo.LIZ(LIZLLL, i2);
                                                                if (((Boolean) C99O.LJFF.getValue()).booleanValue() && !C79004UzY.LJJIFFI(LIZLLL.getItems())) {
                                                                    for (Aweme aweme : LIZLLL.getItems()) {
                                                                        if (aweme != null) {
                                                                            C38995FSd.LIZLLL().execute(new ARunnableS15S0101000_11(1, aweme, 2));
                                                                        }
                                                                    }
                                                                }
                                                                boolean z2 = C48236IwS.LJIILL;
                                                                if (C48236IwS.LJIILL) {
                                                                    C48236IwS.LJIILL = false;
                                                                }
                                                                LIZLLL.appendCache = z2;
                                                                LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager().LJI(LIZLLL.getItems());
                                                                c39080FVk.LIZ = LIZLLL;
                                                                if (LIZLLL.getItems() == null || c39080FVk.LIZ.getItems().size() >= 5 || !((Boolean) C33867DQx.LIZIZ.getValue()).booleanValue()) {
                                                                    return LIZLLL;
                                                                }
                                                                C34186DbK.LIZ = true;
                                                                C36093EEn.LIZ.getClass();
                                                                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                                                                LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(4, 0));
                                                                LJIIIZ.LIZJ();
                                                                return LIZLLL;
                                                            }
                                                        }
                                                    } catch (Exception unused3) {
                                                    }
                                                    return null;
                                                }
                                            }, C38995FSd.LIZLLL(), null);
                                        }
                                    } catch (Exception unused2) {
                                        str4 = null;
                                        str5 = null;
                                        str6 = null;
                                        this.LIZIZ = C10K.LIZIZ(new Callable() { // from class: X.FVl
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                final int i2;
                                                boolean z;
                                                FeedItemList LIZLLL;
                                                final C39080FVk c39080FVk = C39080FVk.this;
                                                final String str7 = str2;
                                                final String str8 = str;
                                                final String str9 = str3;
                                                final String str10 = str4;
                                                final String str11 = str5;
                                                final int i3 = i;
                                                final String str12 = str6;
                                                c39080FVk.getClass();
                                                EF7.LIZIZ();
                                                try {
                                                    if (C2NU.LIZ.LIZIZ()) {
                                                        if (c39080FVk.LJ) {
                                                            c39080FVk.LJ = false;
                                                        } else {
                                                            if (C1A7.LJIILIIL().LIZ(0, "cold_start_times") <= 1) {
                                                                i2 = 4;
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            System.currentTimeMillis();
                                                            C56662Kg.LIZ().LJFF("app_start_to_preload_first_request", false);
                                                            C56662Kg.LIZ().LIZJ("cold_boot_first_request_to_get_did", false);
                                                            if (E3T.LIZ() == E3T.LIZIZ) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (z && c39080FVk.LIZJ == null) {
                                                                FutureTask<FeedItemList> futureTask = new FutureTask<>(new Callable() { // from class: X.FVo
                                                                    @Override // java.util.concurrent.Callable
                                                                    public final Object call() {
                                                                        C39080FVk c39080FVk2 = C39080FVk.this;
                                                                        int i4 = i2;
                                                                        String str13 = str7;
                                                                        String str14 = str8;
                                                                        String str15 = str9;
                                                                        String str16 = str10;
                                                                        String str17 = str11;
                                                                        int i5 = i3;
                                                                        String str18 = str12;
                                                                        c39080FVk2.getClass();
                                                                        return C39080FVk.LIZLLL(i4, i5, str13, str14, str15, str16, str17, str18);
                                                                    }
                                                                });
                                                                c39080FVk.LIZJ = futureTask;
                                                                futureTask.run();
                                                                try {
                                                                    LIZLLL = c39080FVk.LIZJ.get(8000L, TimeUnit.MILLISECONDS);
                                                                } catch (Exception unused22) {
                                                                    LIZLLL = FW5.LJFF(E3T.LIZIZ());
                                                                    FW5.LJIIIZ("no_preload_repsonse", "");
                                                                }
                                                                FFX.LIZ("new_user_fallback", "data_preload_type");
                                                            } else {
                                                                if (!C39082FVm.LIZLLL.LIZ.containsKey("data_preload_type")) {
                                                                    FFX.LIZ("data_type_preload_other", "data_preload_type");
                                                                }
                                                                LIZLLL = C39080FVk.LIZLLL(i2, i3, str7, str8, str9, str10, str11, str12);
                                                            }
                                                            if (((Boolean) C94M.LIZJ.getValue()).booleanValue()) {
                                                                Thread.sleep(((Number) C94M.LIZIZ.getValue()).longValue());
                                                            }
                                                            C46364IHo.LIZ(LIZLLL, i2);
                                                            if (((Boolean) C99O.LJFF.getValue()).booleanValue() && !C79004UzY.LJJIFFI(LIZLLL.getItems())) {
                                                                for (Aweme aweme : LIZLLL.getItems()) {
                                                                    if (aweme != null) {
                                                                        C38995FSd.LIZLLL().execute(new ARunnableS15S0101000_11(1, aweme, 2));
                                                                    }
                                                                }
                                                            }
                                                            boolean z2 = C48236IwS.LJIILL;
                                                            if (C48236IwS.LJIILL) {
                                                                C48236IwS.LJIILL = false;
                                                            }
                                                            LIZLLL.appendCache = z2;
                                                            LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager().LJI(LIZLLL.getItems());
                                                            c39080FVk.LIZ = LIZLLL;
                                                            if (LIZLLL.getItems() == null || c39080FVk.LIZ.getItems().size() >= 5 || !((Boolean) C33867DQx.LIZIZ.getValue()).booleanValue()) {
                                                                return LIZLLL;
                                                            }
                                                            C34186DbK.LIZ = true;
                                                            C36093EEn.LIZ.getClass();
                                                            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                                                            LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(4, 0));
                                                            LJIIIZ.LIZJ();
                                                            return LIZLLL;
                                                        }
                                                    }
                                                } catch (Exception unused3) {
                                                }
                                                return null;
                                            }
                                        }, C38995FSd.LIZLLL(), null);
                                    }
                                } catch (Exception unused3) {
                                    str3 = null;
                                    str4 = null;
                                    str5 = null;
                                    str6 = null;
                                    this.LIZIZ = C10K.LIZIZ(new Callable() { // from class: X.FVl
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            final int i2;
                                            boolean z;
                                            FeedItemList LIZLLL;
                                            final C39080FVk c39080FVk = C39080FVk.this;
                                            final String str7 = str2;
                                            final String str8 = str;
                                            final String str9 = str3;
                                            final String str10 = str4;
                                            final String str11 = str5;
                                            final int i3 = i;
                                            final String str12 = str6;
                                            c39080FVk.getClass();
                                            EF7.LIZIZ();
                                            try {
                                                if (C2NU.LIZ.LIZIZ()) {
                                                    if (c39080FVk.LJ) {
                                                        c39080FVk.LJ = false;
                                                    } else {
                                                        if (C1A7.LJIILIIL().LIZ(0, "cold_start_times") <= 1) {
                                                            i2 = 4;
                                                        } else {
                                                            i2 = 0;
                                                        }
                                                        System.currentTimeMillis();
                                                        C56662Kg.LIZ().LJFF("app_start_to_preload_first_request", false);
                                                        C56662Kg.LIZ().LIZJ("cold_boot_first_request_to_get_did", false);
                                                        if (E3T.LIZ() == E3T.LIZIZ) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (z && c39080FVk.LIZJ == null) {
                                                            FutureTask<FeedItemList> futureTask = new FutureTask<>(new Callable() { // from class: X.FVo
                                                                @Override // java.util.concurrent.Callable
                                                                public final Object call() {
                                                                    C39080FVk c39080FVk2 = C39080FVk.this;
                                                                    int i4 = i2;
                                                                    String str13 = str7;
                                                                    String str14 = str8;
                                                                    String str15 = str9;
                                                                    String str16 = str10;
                                                                    String str17 = str11;
                                                                    int i5 = i3;
                                                                    String str18 = str12;
                                                                    c39080FVk2.getClass();
                                                                    return C39080FVk.LIZLLL(i4, i5, str13, str14, str15, str16, str17, str18);
                                                                }
                                                            });
                                                            c39080FVk.LIZJ = futureTask;
                                                            futureTask.run();
                                                            try {
                                                                LIZLLL = c39080FVk.LIZJ.get(8000L, TimeUnit.MILLISECONDS);
                                                            } catch (Exception unused22) {
                                                                LIZLLL = FW5.LJFF(E3T.LIZIZ());
                                                                FW5.LJIIIZ("no_preload_repsonse", "");
                                                            }
                                                            FFX.LIZ("new_user_fallback", "data_preload_type");
                                                        } else {
                                                            if (!C39082FVm.LIZLLL.LIZ.containsKey("data_preload_type")) {
                                                                FFX.LIZ("data_type_preload_other", "data_preload_type");
                                                            }
                                                            LIZLLL = C39080FVk.LIZLLL(i2, i3, str7, str8, str9, str10, str11, str12);
                                                        }
                                                        if (((Boolean) C94M.LIZJ.getValue()).booleanValue()) {
                                                            Thread.sleep(((Number) C94M.LIZIZ.getValue()).longValue());
                                                        }
                                                        C46364IHo.LIZ(LIZLLL, i2);
                                                        if (((Boolean) C99O.LJFF.getValue()).booleanValue() && !C79004UzY.LJJIFFI(LIZLLL.getItems())) {
                                                            for (Aweme aweme : LIZLLL.getItems()) {
                                                                if (aweme != null) {
                                                                    C38995FSd.LIZLLL().execute(new ARunnableS15S0101000_11(1, aweme, 2));
                                                                }
                                                            }
                                                        }
                                                        boolean z2 = C48236IwS.LJIILL;
                                                        if (C48236IwS.LJIILL) {
                                                            C48236IwS.LJIILL = false;
                                                        }
                                                        LIZLLL.appendCache = z2;
                                                        LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager().LJI(LIZLLL.getItems());
                                                        c39080FVk.LIZ = LIZLLL;
                                                        if (LIZLLL.getItems() == null || c39080FVk.LIZ.getItems().size() >= 5 || !((Boolean) C33867DQx.LIZIZ.getValue()).booleanValue()) {
                                                            return LIZLLL;
                                                        }
                                                        C34186DbK.LIZ = true;
                                                        C36093EEn.LIZ.getClass();
                                                        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                                                        LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(4, 0));
                                                        LJIIIZ.LIZJ();
                                                        return LIZLLL;
                                                    }
                                                }
                                            } catch (Exception unused32) {
                                            }
                                            return null;
                                        }
                                    }, C38995FSd.LIZLLL(), null);
                                }
                            } catch (Exception unused4) {
                                str = null;
                            }
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                            str5 = null;
                        }
                    } catch (Exception unused5) {
                        str = null;
                        str2 = null;
                    }
                    try {
                        i = ((Integer) objArr[5]).intValue();
                        str6 = (String) objArr[6];
                    } catch (Exception unused6) {
                        str6 = null;
                        this.LIZIZ = C10K.LIZIZ(new Callable() { // from class: X.FVl
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                final int i2;
                                boolean z;
                                FeedItemList LIZLLL;
                                final C39080FVk c39080FVk = C39080FVk.this;
                                final String str7 = str2;
                                final String str8 = str;
                                final String str9 = str3;
                                final String str10 = str4;
                                final String str11 = str5;
                                final int i3 = i;
                                final String str12 = str6;
                                c39080FVk.getClass();
                                EF7.LIZIZ();
                                try {
                                    if (C2NU.LIZ.LIZIZ()) {
                                        if (c39080FVk.LJ) {
                                            c39080FVk.LJ = false;
                                        } else {
                                            if (C1A7.LJIILIIL().LIZ(0, "cold_start_times") <= 1) {
                                                i2 = 4;
                                            } else {
                                                i2 = 0;
                                            }
                                            System.currentTimeMillis();
                                            C56662Kg.LIZ().LJFF("app_start_to_preload_first_request", false);
                                            C56662Kg.LIZ().LIZJ("cold_boot_first_request_to_get_did", false);
                                            if (E3T.LIZ() == E3T.LIZIZ) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z && c39080FVk.LIZJ == null) {
                                                FutureTask<FeedItemList> futureTask = new FutureTask<>(new Callable() { // from class: X.FVo
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        C39080FVk c39080FVk2 = C39080FVk.this;
                                                        int i4 = i2;
                                                        String str13 = str7;
                                                        String str14 = str8;
                                                        String str15 = str9;
                                                        String str16 = str10;
                                                        String str17 = str11;
                                                        int i5 = i3;
                                                        String str18 = str12;
                                                        c39080FVk2.getClass();
                                                        return C39080FVk.LIZLLL(i4, i5, str13, str14, str15, str16, str17, str18);
                                                    }
                                                });
                                                c39080FVk.LIZJ = futureTask;
                                                futureTask.run();
                                                try {
                                                    LIZLLL = c39080FVk.LIZJ.get(8000L, TimeUnit.MILLISECONDS);
                                                } catch (Exception unused22) {
                                                    LIZLLL = FW5.LJFF(E3T.LIZIZ());
                                                    FW5.LJIIIZ("no_preload_repsonse", "");
                                                }
                                                FFX.LIZ("new_user_fallback", "data_preload_type");
                                            } else {
                                                if (!C39082FVm.LIZLLL.LIZ.containsKey("data_preload_type")) {
                                                    FFX.LIZ("data_type_preload_other", "data_preload_type");
                                                }
                                                LIZLLL = C39080FVk.LIZLLL(i2, i3, str7, str8, str9, str10, str11, str12);
                                            }
                                            if (((Boolean) C94M.LIZJ.getValue()).booleanValue()) {
                                                Thread.sleep(((Number) C94M.LIZIZ.getValue()).longValue());
                                            }
                                            C46364IHo.LIZ(LIZLLL, i2);
                                            if (((Boolean) C99O.LJFF.getValue()).booleanValue() && !C79004UzY.LJJIFFI(LIZLLL.getItems())) {
                                                for (Aweme aweme : LIZLLL.getItems()) {
                                                    if (aweme != null) {
                                                        C38995FSd.LIZLLL().execute(new ARunnableS15S0101000_11(1, aweme, 2));
                                                    }
                                                }
                                            }
                                            boolean z2 = C48236IwS.LJIILL;
                                            if (C48236IwS.LJIILL) {
                                                C48236IwS.LJIILL = false;
                                            }
                                            LIZLLL.appendCache = z2;
                                            LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager().LJI(LIZLLL.getItems());
                                            c39080FVk.LIZ = LIZLLL;
                                            if (LIZLLL.getItems() == null || c39080FVk.LIZ.getItems().size() >= 5 || !((Boolean) C33867DQx.LIZIZ.getValue()).booleanValue()) {
                                                return LIZLLL;
                                            }
                                            C34186DbK.LIZ = true;
                                            C36093EEn.LIZ.getClass();
                                            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                                            LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(4, 0));
                                            LJIIIZ.LIZJ();
                                            return LIZLLL;
                                        }
                                    }
                                } catch (Exception unused32) {
                                }
                                return null;
                            }
                        }, C38995FSd.LIZLLL(), null);
                    }
                    this.LIZIZ = C10K.LIZIZ(new Callable() { // from class: X.FVl
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            final int i2;
                            boolean z;
                            FeedItemList LIZLLL;
                            final C39080FVk c39080FVk = C39080FVk.this;
                            final String str7 = str2;
                            final String str8 = str;
                            final String str9 = str3;
                            final String str10 = str4;
                            final String str11 = str5;
                            final int i3 = i;
                            final String str12 = str6;
                            c39080FVk.getClass();
                            EF7.LIZIZ();
                            try {
                                if (C2NU.LIZ.LIZIZ()) {
                                    if (c39080FVk.LJ) {
                                        c39080FVk.LJ = false;
                                    } else {
                                        if (C1A7.LJIILIIL().LIZ(0, "cold_start_times") <= 1) {
                                            i2 = 4;
                                        } else {
                                            i2 = 0;
                                        }
                                        System.currentTimeMillis();
                                        C56662Kg.LIZ().LJFF("app_start_to_preload_first_request", false);
                                        C56662Kg.LIZ().LIZJ("cold_boot_first_request_to_get_did", false);
                                        if (E3T.LIZ() == E3T.LIZIZ) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z && c39080FVk.LIZJ == null) {
                                            FutureTask<FeedItemList> futureTask = new FutureTask<>(new Callable() { // from class: X.FVo
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    C39080FVk c39080FVk2 = C39080FVk.this;
                                                    int i4 = i2;
                                                    String str13 = str7;
                                                    String str14 = str8;
                                                    String str15 = str9;
                                                    String str16 = str10;
                                                    String str17 = str11;
                                                    int i5 = i3;
                                                    String str18 = str12;
                                                    c39080FVk2.getClass();
                                                    return C39080FVk.LIZLLL(i4, i5, str13, str14, str15, str16, str17, str18);
                                                }
                                            });
                                            c39080FVk.LIZJ = futureTask;
                                            futureTask.run();
                                            try {
                                                LIZLLL = c39080FVk.LIZJ.get(8000L, TimeUnit.MILLISECONDS);
                                            } catch (Exception unused22) {
                                                LIZLLL = FW5.LJFF(E3T.LIZIZ());
                                                FW5.LJIIIZ("no_preload_repsonse", "");
                                            }
                                            FFX.LIZ("new_user_fallback", "data_preload_type");
                                        } else {
                                            if (!C39082FVm.LIZLLL.LIZ.containsKey("data_preload_type")) {
                                                FFX.LIZ("data_type_preload_other", "data_preload_type");
                                            }
                                            LIZLLL = C39080FVk.LIZLLL(i2, i3, str7, str8, str9, str10, str11, str12);
                                        }
                                        if (((Boolean) C94M.LIZJ.getValue()).booleanValue()) {
                                            Thread.sleep(((Number) C94M.LIZIZ.getValue()).longValue());
                                        }
                                        C46364IHo.LIZ(LIZLLL, i2);
                                        if (((Boolean) C99O.LJFF.getValue()).booleanValue() && !C79004UzY.LJJIFFI(LIZLLL.getItems())) {
                                            for (Aweme aweme : LIZLLL.getItems()) {
                                                if (aweme != null) {
                                                    C38995FSd.LIZLLL().execute(new ARunnableS15S0101000_11(1, aweme, 2));
                                                }
                                            }
                                        }
                                        boolean z2 = C48236IwS.LJIILL;
                                        if (C48236IwS.LJIILL) {
                                            C48236IwS.LJIILL = false;
                                        }
                                        LIZLLL.appendCache = z2;
                                        LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager().LJI(LIZLLL.getItems());
                                        c39080FVk.LIZ = LIZLLL;
                                        if (LIZLLL.getItems() == null || c39080FVk.LIZ.getItems().size() >= 5 || !((Boolean) C33867DQx.LIZIZ.getValue()).booleanValue()) {
                                            return LIZLLL;
                                        }
                                        C34186DbK.LIZ = true;
                                        C36093EEn.LIZ.getClass();
                                        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                                        LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(4, 0));
                                        LJIIIZ.LIZJ();
                                        return LIZLLL;
                                    }
                                }
                            } catch (Exception unused32) {
                            }
                            return null;
                        }
                    }, C38995FSd.LIZLLL(), null);
                }
            }
        }
    }

    @Override // X.InterfaceC39076FVg
    public final void LIZJ(FeedItemList feedItemList) {
        this.LIZIZ = null;
        this.LIZ = null;
        this.LJ = false;
        this.LIZLLL = false;
        this.LIZLLL = true;
        this.LIZ = feedItemList;
    }

    public static FeedItemList LIZLLL(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle bundle;
        if (str4 != null && str5 != null) {
            bundle = C0H1.LIZ("insert_items", InsertItemParamsKt.getPushInsertItems(str, str2, str4, str5));
        } else {
            bundle = null;
        }
        return FeedApiService.LIZ().fetchFeedList(0, 0L, 0L, 6, null, str, i, 0, "", str2, str3, 0L, new C66851QLn(), bundle, Boolean.FALSE, i2, str6);
    }
}
