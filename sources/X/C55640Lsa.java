package X;

import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Lsa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55640Lsa implements InterfaceC56318M8k {
    public final /* synthetic */ AbstractC48820JEa LIZ;
    public final /* synthetic */ FeedCommonService LIZIZ;

    @Override // X.InterfaceC56318M8k
    public final void LIZ(M74 m74) {
        String str;
        String sceneId;
        AY1 popupExtraParams;
        InterfaceC55642Lsc interfaceC55642Lsc = (InterfaceC55642Lsc) m74.getClass().getAnnotation(InterfaceC55642Lsc.class);
        String str2 = "";
        if (interfaceC55642Lsc == null || (str = interfaceC55642Lsc.value()) == null) {
            str = "";
        }
        if (o.LJ(str, "global_shop_tab_tooltip")) {
            C2U8.LIZ(new LRJ(1));
        }
        if (m74.getPopupType() == EnumC40513FvB.CONTAINER && ((popupExtraParams = m74.getPopupExtraParams()) == null || (str = popupExtraParams.LJLIL) == null)) {
            str = "";
        }
        FeedCommonService feedCommonService = this.LIZIZ;
        InterfaceC55643Lsd interfaceC55643Lsd = m74.scene;
        if (interfaceC55643Lsd != null && (sceneId = interfaceC55643Lsd.getSceneId()) != null) {
            str2 = sceneId;
        }
        feedCommonService.LIZJ(str2, str);
        FeedCommonService feedCommonService2 = this.LIZIZ;
        InterfaceC55643Lsd interfaceC55643Lsd2 = m74.scene;
        if (interfaceC55643Lsd2 != null) {
            interfaceC55643Lsd2.getSceneId();
        }
        feedCommonService2.LJJI();
        AbstractC48820JEa abstractC48820JEa = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popupDismissed:");
        LIZ.append(str);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @Override // X.InterfaceC56318M8k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.M74 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.local_test.LocalTestApi> r0 = com.ss.android.ugc.aweme.local_test.LocalTestApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.local_test.LocalTestApi r0 = (com.ss.android.ugc.aweme.local_test.LocalTestApi) r0
            boolean r2 = r0.isOpenPopupDebug()
            java.lang.Class r1 = r6.getClass()
            java.lang.Class<X.Lsc> r0 = X.InterfaceC55642Lsc.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            X.Lsc r0 = (X.InterfaceC55642Lsc) r0
            if (r0 == 0) goto L29
            java.lang.String r3 = r0.value()
            if (r3 != 0) goto L2b
        L29:
            java.lang.String r3 = ""
        L2b:
            if (r2 == 0) goto L72
            java.lang.String r0 = "global_shop_tab_tooltip"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L3e
            X.LRJ r1 = new X.LRJ
            r0 = 0
            r1.<init>(r0)
            X.C2U8.LIZ(r1)
        L3e:
            boolean r0 = r6 instanceof X.AbstractC56325M8r
            if (r0 == 0) goto L88
            X.M8r r6 = (X.AbstractC56325M8r) r6
            X.LKk r0 = r6.getPopupContext()
            if (r0 == 0) goto La6
            X.1qj r0 = r0.LIZJ()
        L4e:
            X.5S1 r4 = new X.5S1
            r4.<init>(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r3)
            java.lang.String r0 = "call show popup"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.LIZLLL(r0)
            X.AKb r2 = r4.LIZIZ
            if (r2 == 0) goto L6f
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.LIZLLL(r0)
        L6f:
            r4.LJ()
        L72:
            X.JEa r2 = r5.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "showPopup:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.LJIIIIZZ(r0)
            return
        L88:
            boolean r0 = r6 instanceof X.AbstractC55363Lo7
            if (r0 == 0) goto L99
            X.Lo7 r6 = (X.AbstractC55363Lo7) r6
            X.LKk r0 = r6.getPopupContext()
            if (r0 == 0) goto La6
            X.1qj r0 = r0.LIZJ()
            goto L4e
        L99:
            X.Lsd r0 = r6.scene
            X.LKk r0 = r0.getPopupContext()
            if (r0 == 0) goto La6
            X.1qj r0 = r0.LIZJ()
            goto L4e
        La6:
            r0 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55640Lsa.LIZJ(X.M74):void");
    }

    public C55640Lsa(C55652Lsm c55652Lsm, FeedCommonService feedCommonService) {
        this.LIZ = c55652Lsm;
        this.LIZIZ = feedCommonService;
    }

    @Override // X.InterfaceC56318M8k
    public final void LIZIZ(M74 task, String errMsg) {
        String str;
        ActivityC45651qj LIZJ;
        o.LJIIIZ(task, "task");
        o.LJIIIZ(errMsg, "errMsg");
        boolean isOpenPopupDebug = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).isOpenPopupDebug();
        InterfaceC55642Lsc interfaceC55642Lsc = (InterfaceC55642Lsc) task.getClass().getAnnotation(InterfaceC55642Lsc.class);
        if (interfaceC55642Lsc == null || (str = interfaceC55642Lsc.value()) == null) {
            str = "";
        }
        if (o.LJ(str, "global_shop_tab_tooltip")) {
            C2U8.LIZ(new LRJ(1));
        }
        if (isOpenPopupDebug) {
            if (task instanceof AbstractC56325M8r) {
                C54082LKk popupContext = ((AbstractC56325M8r) task).getPopupContext();
                if (popupContext != null) {
                    LIZJ = popupContext.LIZJ();
                    C5S1 c5s1 = new C5S1(LIZJ);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append("show failed because:");
                    LIZ.append(errMsg);
                    c5s1.LIZLLL(X1D.LIZIZ(LIZ));
                    c5s1.LJ();
                }
                LIZJ = null;
                C5S1 c5s12 = new C5S1(LIZJ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append("show failed because:");
                LIZ2.append(errMsg);
                c5s12.LIZLLL(X1D.LIZIZ(LIZ2));
                c5s12.LJ();
            } else if (task instanceof AbstractC55363Lo7) {
                C54082LKk popupContext2 = ((AbstractC55363Lo7) task).getPopupContext();
                if (popupContext2 != null) {
                    LIZJ = popupContext2.LIZJ();
                    C5S1 c5s122 = new C5S1(LIZJ);
                    StringBuilder LIZ22 = X1D.LIZ();
                    LIZ22.append(str);
                    LIZ22.append("show failed because:");
                    LIZ22.append(errMsg);
                    c5s122.LIZLLL(X1D.LIZIZ(LIZ22));
                    c5s122.LJ();
                }
                LIZJ = null;
                C5S1 c5s1222 = new C5S1(LIZJ);
                StringBuilder LIZ222 = X1D.LIZ();
                LIZ222.append(str);
                LIZ222.append("show failed because:");
                LIZ222.append(errMsg);
                c5s1222.LIZLLL(X1D.LIZIZ(LIZ222));
                c5s1222.LJ();
            } else {
                C54082LKk popupContext3 = task.scene.getPopupContext();
                if (popupContext3 != null) {
                    LIZJ = popupContext3.LIZJ();
                    C5S1 c5s12222 = new C5S1(LIZJ);
                    StringBuilder LIZ2222 = X1D.LIZ();
                    LIZ2222.append(str);
                    LIZ2222.append("show failed because:");
                    LIZ2222.append(errMsg);
                    c5s12222.LIZLLL(X1D.LIZIZ(LIZ2222));
                    c5s12222.LJ();
                }
                LIZJ = null;
                C5S1 c5s122222 = new C5S1(LIZJ);
                StringBuilder LIZ22222 = X1D.LIZ();
                LIZ22222.append(str);
                LIZ22222.append("show failed because:");
                LIZ22222.append(errMsg);
                c5s122222.LIZLLL(X1D.LIZIZ(LIZ22222));
                c5s122222.LJ();
            }
        }
        AbstractC48820JEa abstractC48820JEa = this.LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("showPopupFailed:");
        LIZ3.append(str);
        LIZ3.append("reason:");
        LIZ3.append(errMsg);
        abstractC48820JEa.LIZLLL(X1D.LIZIZ(LIZ3));
    }
}
