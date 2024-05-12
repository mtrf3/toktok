package X;

import Y.IDCallbackS368S0100000_14;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.Vuc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81246Vuc {
    public static volatile C81246Vuc LIZLLL;
    public final C81126Vsg LIZ;
    public final Handler LIZIZ;
    public final C81245Vub LIZJ;

    public C81246Vuc(Context context) {
        IDCallbackS368S0100000_14 iDCallbackS368S0100000_14 = new IDCallbackS368S0100000_14(this, 0);
        this.LIZ = new C81126Vsg(context);
        this.LIZIZ = new Handler(iDCallbackS368S0100000_14);
        this.LIZJ = C81245Vub.LJ(LiveLayoutPreloadThreadPriority.DEFAULT, false);
    }

    public static boolean LIZJ(Context context) {
        if (LIZLLL != null && C31729Ccn.LIZ(LIZLLL.LIZ.getContext()) == C31729Ccn.LIZ(context)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(Context context) {
        if (LIZLLL == null) {
            C81245Vub c81245Vub = this.LIZJ;
            C81247Vud[] c81247VudArr = (C81247Vud[]) c81245Vub.LJLIL.toArray(new C81247Vud[0]);
            c81245Vub.LJLIL.clear();
            for (C81247Vud c81247Vud : c81247VudArr) {
                c81247Vud.LJFF = null;
                c81247Vud.LIZ = null;
                c81247Vud.LIZIZ = null;
                c81247Vud.LIZJ = 0;
                c81247Vud.LJ = null;
                c81245Vub.LJLILLLLZI.LIZ(c81247Vud);
            }
            return;
        }
        if (LIZJ(context)) {
            C81245Vub c81245Vub2 = this.LIZJ;
            C81247Vud[] c81247VudArr2 = (C81247Vud[]) c81245Vub2.LJLIL.toArray(new C81247Vud[0]);
            c81245Vub2.LJLIL.clear();
            for (C81247Vud c81247Vud2 : c81247VudArr2) {
                c81247Vud2.LJFF = null;
                c81247Vud2.LIZ = null;
                c81247Vud2.LIZIZ = null;
                c81247Vud2.LIZJ = 0;
                c81247Vud2.LJ = null;
                c81245Vub2.LJLILLLLZI.LIZ(c81247Vud2);
            }
        }
    }

    public C81246Vuc(Context context, int i) {
        IDCallbackS368S0100000_14 iDCallbackS368S0100000_14 = new IDCallbackS368S0100000_14(this, 0);
        this.LIZ = new C81126Vsg(context);
        this.LIZIZ = new Handler(iDCallbackS368S0100000_14);
        this.LIZJ = C81245Vub.LJ(i, true);
    }

    public static C81246Vuc LIZ(int i, Context context) {
        if (LIZLLL == null || !LIZJ(context)) {
            synchronized (C81246Vuc.class) {
                if (LIZLLL == null || !LIZJ(context)) {
                    if (LIZLLL != null) {
                        LIZLLL.LIZLLL(LIZLLL.LIZ.getContext());
                    }
                    LIZLLL = new C81246Vuc(context, i);
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ(int i, ViewGroup viewGroup, int i2, InterfaceC81248Vue interfaceC81248Vue) {
        C81247Vud LIZIZ = this.LIZJ.LJLILLLLZI.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new C81247Vud();
        }
        LIZIZ.LIZ = this;
        LIZIZ.LIZJ = i;
        LIZIZ.LIZLLL = i2;
        LIZIZ.LIZIZ = viewGroup;
        LIZIZ.LJFF = interfaceC81248Vue;
        C81245Vub c81245Vub = this.LIZJ;
        c81245Vub.getClass();
        try {
            c81245Vub.LJLIL.put(LIZIZ);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}
