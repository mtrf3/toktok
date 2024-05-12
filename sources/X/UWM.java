package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftListStaticDataTTLSetting;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWM {
    public static final /* synthetic */ int LJFF = 0;
    public final UWR LIZ;
    public C77286UUw LIZIZ;
    public final C32287Cln LIZJ;
    public XKQ LIZLLL;
    public String LJ;

    public final void LIZ(boolean z) {
        InterfaceC64510PTm interfaceC64510PTm;
        C64520PTw c64520PTw;
        UWO uwo;
        String[] list;
        long j;
        String str;
        Long LJJIZ;
        C32420Cnw LIZIZ = C32312CmC.LIZIZ("", UWV.LIZ());
        C32287Cln c32287Cln = this.LIZJ;
        InterfaceC64517PTt interfaceC64517PTt = c32287Cln.LIZIZ;
        if (interfaceC64517PTt != null) {
            interfaceC64510PTm = interfaceC64517PTt.LIZIZ(LIZIZ, c32287Cln);
        } else {
            interfaceC64510PTm = null;
        }
        if ((interfaceC64510PTm instanceof InterfaceC64510PTm) && interfaceC64510PTm != null && (interfaceC64510PTm instanceof C64520PTw) && (c64520PTw = (C64520PTw) interfaceC64510PTm) != null) {
            if (!z) {
                java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.y2.LIZJ();
                if (o.LJ(LIZIZ.LIZ, LIZJ.get("latest_hash")) && (str = LIZJ.get("latest_timestamp")) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                if (System.currentTimeMillis() - j <= TimeUnit.DAYS.toMillis(LiveGiftListStaticDataTTLSetting.INSTANCE.getValue()) && c64520PTw.LIZ(LIZIZ).exists()) {
                    return;
                }
            }
            C0NB.LJIIIZ("GiftListManager", "Remove all copies");
            this.LIZ.LIZIZ = null;
            C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.y2;
            c48459J0d.LIZ(new HashMap());
            c48459J0d.LIZLLL();
            InterfaceC32418Cnu interfaceC32418Cnu = c64520PTw.LIZ;
            if ((interfaceC32418Cnu instanceof UWO) && (uwo = (UWO) interfaceC32418Cnu) != null) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(uwo.LIZIZ);
                    LIZ.append(File.separator);
                    LIZ.append("gift_list");
                    File file = new File(X1D.LIZIZ(LIZ));
                    if (file.isDirectory() && (list = file.list()) != null) {
                        for (String str2 : list) {
                            C16880lQ.LLLZZIL(new File(file, str2));
                        }
                    }
                } catch (Exception e) {
                    C0NB.LJI("ColdDataDownloadProducer", e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C32420Cnw r7, X.InterfaceC67352kd<? super com.bytedance.android.livesdk.service.assets.giftlist.colddata.GiftColdData> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.UWQ
            if (r0 == 0) goto L79
            r5 = r8
            X.UWQ r5 = (X.UWQ) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L46
            if (r0 != r3) goto L80
            X.Cnw r7 = r5.LJLILLLLZI
            X.UWM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            X.UWR r0 = r0.LIZ
            com.bytedance.android.livesdk.service.assets.giftlist.colddata.GiftColdData r1 = r0.LIZ(r7)
            if (r1 == 0) goto L3a
            com.bytedance.android.livesdk.service.assets.giftlist.colddata.GiftColdMetaData r0 = r1.metadata
            if (r0 == 0) goto L3a
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.Gift> r0 = r1.LIZ
            if (r0 == 0) goto L3a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7f
        L3a:
            X.UWF r0 = new X.UWF
            java.lang.String r1 = "Empty Data"
            r2 = 0
            r4 = 6
            r3 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        L46:
            X.C141335gf.LIZJ(r1)
            java.lang.String r2 = "GiftListManager"
            java.lang.String r0 = "startFetchData: removeColdDataFileIfNeed"
            X.C0NB.LJIIIZ(r2, r0)
            r6.LIZ(r3)
            X.Cln r1 = r6.LIZJ
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r3
            java.lang.String r0 = "fetchColdData"
            X.C0NB.LJIIIZ(r2, r0)
            X.C15380j0.LIZLLL()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L88
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L88
            java.lang.Object r0 = r6.LJ(r7, r1, r5)
            if (r0 != r4) goto L74
        L71:
            if (r0 != r4) goto L77
            return r4
        L74:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L71
        L77:
            r0 = r6
            goto L24
        L79:
            X.UWQ r5 = new X.UWQ
            r5.<init>(r6, r8)
            goto L12
        L7f:
            return r1
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            X.UWF r0 = new X.UWF
            java.lang.String r1 = "Network unavailable"
            r2 = 0
            r4 = 6
            r3 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWM.LIZJ(X.Cnw, X.2kd):java.lang.Object");
    }

    public UWM(UWR uwr, C77286UUw c77286UUw, C32287Cln c32287Cln) {
        this.LIZ = uwr;
        this.LIZIZ = c77286UUw;
        this.LIZJ = c32287Cln;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013f, code lost:
    
        if (r3 != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C32420Cnw r10, X.C32287Cln r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWM.LJ(X.Cnw, X.Cln, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:46|47))(6:48|49|50|(3:52|53|(1:55)(1:56))|57|58)|12|(12:14|(2:17|15)|18|19|(1:21)|22|23|(2:25|(2:27|(2:34|35)(2:31|32)))|36|(1:38)|39|(2:41|42)(1:43))(2:44|45)))|63|6|7|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        r4 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r4);
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:11:0x0073, B:12:0x0076, B:14:0x007c, B:15:0x0084, B:17:0x008a, B:19:0x0098, B:21:0x00bf, B:22:0x00c5, B:44:0x00c9, B:45:0x00d4, B:53:0x0043), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:11:0x0073, B:12:0x0076, B:14:0x007c, B:15:0x0084, B:17:0x008a, B:19:0x0098, B:21:0x00bf, B:22:0x00c5, B:44:0x00c9, B:45:0x00d4, B:53:0x0043), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r15, long r16, java.lang.String r18, X.InterfaceC67352kd r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWM.LIZIZ(int, long, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r12, long r13, java.lang.String r15, X.InterfaceC67352kd r16) {
        /*
            r11 = this;
            r6 = r12
            r3 = r16
            boolean r0 = r3 instanceof X.UWS
            r5 = r11
            if (r0 == 0) goto L65
            r10 = r3
            X.UWS r10 = (X.UWS) r10
            int r2 = r10.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r10.LJLJJL = r2
        L16:
            java.lang.Object r1 = r10.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L6b
            int r6 = r10.LJLILLLLZI
            X.UWM r0 = r10.LJLIL
            X.C141335gf.LIZJ(r1)
        L28:
            if (r1 == 0) goto L30
            X.UUw r0 = r0.LIZIZ
            X.C77285UUv.LIZIZ(r0, r6)
        L2f:
            return r1
        L30:
            r1 = 0
            goto L2f
        L32:
            X.C141335gf.LIZJ(r1)
            java.lang.String r1 = "GiftListManager"
            java.lang.String r0 = "startFetchData: Fetch hot data"
            X.C0NB.LJIIIZ(r1, r0)
            X.UUw r1 = r5.LIZIZ
            r1.getClass()
            java.lang.String r0 = "gift_list_dynamic_data_fetch"
            r1.LJI = r0
            X.UUw r2 = r5.LIZIZ
            r2.getClass()
            long r0 = java.lang.System.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.LJFF = r0
            r10.LJLIL = r5
            r10.LJLILLLLZI = r6
            r10.LJLJJL = r3
            r7 = r13
            r9 = r15
            java.lang.Object r1 = r5.LIZIZ(r6, r7, r9, r10)
            if (r1 != r4) goto L63
            return r4
        L63:
            r0 = r5
            goto L28
        L65:
            X.UWS r10 = new X.UWS
            r10.<init>(r5, r3)
            goto L16
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWM.LIZLLL(int, long, java.lang.String, X.2kd):java.lang.Object");
    }
}
