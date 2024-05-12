package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169736lN extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;

    static {
        TBT tbt = new TBT(C169736lN.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C169736lN.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public final InterfaceC145485nM LLJILJIL() {
        return (InterfaceC145485nM) this.LJLILLLLZI.LIZ(this, LJLJLJ[0]);
    }

    public final C169776lR LLJILJILJ() {
        return (C169776lR) this.LJLJJLL.getValue();
    }

    @Override // X.WM7
    public final void onDestroy() {
        C164986di c164986di;
        C162626Zu c162626Zu;
        C169996ln c169996ln;
        super.onDestroy();
        C169776lR LLJILJILJ = LLJILJILJ();
        InterfaceC153045zY interfaceC153045zY = LLJILJILJ.LJJIIJZLJL;
        if (interfaceC153045zY != null && (c169996ln = LLJILJILJ.LJJIJ) != null) {
            interfaceC153045zY.LLFF(c169996ln);
        }
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = LLJILJILJ.LJJIFFI;
        if (viewOnTouchListenerC141755hL != null && (viewOnTouchListenerC141755hL.getAdapter() instanceof C162626Zu) && (c162626Zu = (C162626Zu) LLJILJILJ.LJJIFFI.getAdapter()) != null) {
            C73411SrX c73411SrX = c162626Zu.LJLJL;
            o.LJI(c73411SrX);
            c73411SrX.dispose();
        }
        C170206m8 c170206m8 = LLJILJILJ.LJJJLZIJ;
        if (c170206m8 != null) {
            InterfaceC84498XEg interfaceC84498XEg = (InterfaceC84498XEg) c170206m8.LIZ;
            if (interfaceC84498XEg != null) {
                interfaceC84498XEg.destroy();
            }
            c170206m8.LIZ = null;
        }
        C170216m9 c170216m9 = LLJILJILJ.LJJIJLIJ;
        if (c170216m9 != null) {
            c170216m9.LJLLILLLL.LJFF();
        }
        C164916db c164916db = LLJILJILJ.LJJJI;
        if (c164916db != null && (c164986di = c164916db.LJLLILLLL) != null) {
            ((C84507XEp) c164986di.LJLLI.getValue()).LJFF();
        }
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
        C169776lR LLJILJILJ = LLJILJILJ();
        RunnableC169896ld runnableC169896ld = LLJILJILJ.LJJIJIIJIL;
        if (runnableC169896ld != null) {
            LLJILJILJ.LJII.post(runnableC169896ld);
        }
        RunnableC169926lg runnableC169926lg = LLJILJILJ.LJJIJIL;
        if (runnableC169926lg != null) {
            LLJILJILJ.LJII.post(runnableC169926lg);
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        LLJILJILJ().LJII.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C169736lN(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, InterfaceC145485nM.class, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 222));
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 223));
        this.LJLJJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(C170116lz.LJLIL);
        this.LJLJL = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x052d, code lost:
    
        if (r4.equals("1") == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169736lN.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        AbstractC42651GoZ LJIJ;
        Bundle bundle2;
        String string;
        EditEffectAnchorManager data;
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (C139255dJ.LIZ && (LJIJ = C86793Y4n.LJIJ(this)) != null && (bundle2 = LJIJ.mArguments) != null && (string = bundle2.getString("extra_edit_effect_uid")) != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) != null && !data.isEditProp()) {
            LLJILJILJ().LJJLIL = true;
        }
        if (C00F.LIZ(31744, 0, "studio_edit_effect_panel_type", true) == 2) {
            i = R.layout.ccb;
        } else {
            i = R.layout.ccc;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(res, container, false)");
        return LLLLIILL;
    }
}
