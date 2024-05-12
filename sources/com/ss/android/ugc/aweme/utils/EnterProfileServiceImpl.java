package com.ss.android.ugc.aweme.utils;

import X.C85413Wv;
import X.InterfaceC110914Wx;
import android.content.Context;
import com.ss.android.ugc.aweme.enter.IEnterProfileService;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EnterProfileServiceImpl implements IEnterProfileService {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.3Wv] */
    @Override // com.ss.android.ugc.aweme.enter.IEnterProfileService
    public final C85413Wv LIZ(Context context, String enterFrom, String str, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        return new InterfaceC110914Wx(context, enterFrom, str, str2) { // from class: X.3Wv
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public java.util.Map<String, ? extends Object> LJ;
            public java.util.Map<String, ? extends Object> LJFF;

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r0 == null) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
            
                r0 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
            
                r7.LJI(r1, r0);
                r5 = r9.LJ.entrySet().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
            
                if (r5.hasNext() == false) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
            
                r0 = r5.next();
                r4 = r0.getKey();
                r1 = r0.getValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
            
                if ((r1 instanceof java.lang.String) == false) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
            
                if ((r1 instanceof java.lang.Integer) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
            
                r7.LJFF(r1, r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
            
                kotlin.jvm.internal.o.LJII(r1, "null cannot be cast to non-null type kotlin.Int");
                r7.LIZLLL(((java.lang.Integer) r1).intValue(), r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
            
                kotlin.jvm.internal.o.LJII(r1, "null cannot be cast to non-null type kotlin.String");
                r7.LJI(r4, (java.lang.String) r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
            
                X.FMX.LJIIL("enter_personal_detail", r7.LIZ);
                r5 = com.bytedance.router.SmartRouter.buildRoute(r9.LIZ, "aweme://user/profile/");
                r1 = r9.LIZJ;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
            
                if (r1 != null) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
            
                r1 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
            
                r5.withParam("uid", r1);
                r0 = r9.LIZLLL;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
            
                if (r0 != null) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
            
                r5.withParam("sec_user_id", r3);
                r5.withParam("enter_from", r9.LIZIZ);
                r4 = r9.LJFF.entrySet().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
            
                if (r4.hasNext() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
            
                r0 = r4.next();
                r5.withParam(X.V3N.LJ(new X.OSZ(r0.getKey(), r0.getValue())));
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
            
                r5.open();
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
            
                r3 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0050, code lost:
            
                if (r4 == null) goto L30;
             */
            @Override // X.InterfaceC110914Wx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ() {
                /*
                    Method dump skipped, instructions count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C85413Wv.LIZJ():void");
            }

            @Override // X.InterfaceC110914Wx
            public final InterfaceC110914Wx LIZ(java.util.Map<String, ? extends Object> map) {
                this.LJ = map;
                return this;
            }

            @Override // X.InterfaceC110914Wx
            public final InterfaceC110914Wx LIZIZ(java.util.Map<String, ? extends Object> map) {
                this.LJFF = map;
                return this;
            }

            {
                o.LJIIIZ(enterFrom, "enterFrom");
                this.LIZ = context;
                this.LIZIZ = enterFrom;
                this.LIZJ = str;
                this.LIZLLL = str2;
                this.LJ = C113554cx.LJJJLIIL();
                this.LJFF = C113554cx.LJJJLIIL();
            }
        };
    }
}
