package Y;

import X.AbstractC06680Oa;
import X.BinderC39601gy;
import X.C027909b;
import X.C06Q;
import X.C0NB;
import X.C18D;
import X.C34551Xf;
import X.C35341a6;
import X.C38031EwF;
import X.C38065Ewn;
import X.C38113ExZ;
import X.C38185Eyj;
import X.C38334F2s;
import X.C40700FyC;
import X.C44298Ha2;
import X.C48202Ivu;
import X.C48334Iy2;
import X.C67649Qgn;
import X.C78880UxY;
import X.C78977Uz7;
import X.EnumC111394Yt;
import X.IJZ;
import X.InterfaceC37466En8;
import X.InterfaceC38034EwI;
import X.InterfaceC38069Ewr;
import X.InterfaceC47046IdG;
import X.InterfaceC69602oG;
import X.Q5F;
import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDRunnableS0S0201000 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int[] iArr = new int[((String[]) this.l0).length];
        PackageManager packageManager = ((Activity) this.l1).getPackageManager();
        String packageName = ((Activity) this.l1).getPackageName();
        int length = ((String[]) this.l0).length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(((String[]) this.l0)[i], packageName);
        }
        ((C06Q) ((Activity) this.l1)).onRequestPermissionsResult(this.i2, (String[]) this.l0, iArr);
    }

    public final void LIZ$1() {
        if (((C34551Xf) this.l1).LJIIZILJ()) {
            return;
        }
        if (((C34551Xf) this.l1).LJLLLL.LJ()) {
            ((C34551Xf) this.l1).LJII();
        } else {
            C34551Xf c34551Xf = (C34551Xf) this.l1;
            c34551Xf.LJLLLL.LJII(this.i2, this.l0, c34551Xf.LJLJJI.LIZ, c34551Xf.LJLIL, c34551Xf.LJZL);
        }
    }

    public final void LIZ$2() {
        if (((C34551Xf) this.l1).LJIIZILJ()) {
            return;
        }
        if (((C34551Xf) this.l1).LJLLLL.LJ()) {
            ((C34551Xf) this.l1).LJII();
        } else {
            C34551Xf c34551Xf = (C34551Xf) this.l1;
            c34551Xf.LJLLLL.LJI(this.i2, this.l0, c34551Xf.LJLJJI.LIZ, c34551Xf.LJLIL, c34551Xf.LJZL);
        }
    }

    public static final void run$0(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            ((BinderC39601gy) iDRunnableS0S0201000.l1).LJLJI.LJJJIL(iDRunnableS0S0201000.i2, (Bundle) iDRunnableS0S0201000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            ((C18D) iDRunnableS0S0201000.l1).LIZ(iDRunnableS0S0201000.i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) iDRunnableS0S0201000.l0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            ((LiveBottomSheetBehavior) iDRunnableS0S0201000.l1).settleToState((View) iDRunnableS0S0201000.l0, iDRunnableS0S0201000.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r3 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$11(Y.IDRunnableS0S0201000 r5) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS0S0201000.run$11(Y.IDRunnableS0S0201000):void");
    }

    public static final void run$12(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            ((SystemForegroundService) iDRunnableS0S0201000.l1).LJLJJI.notify(iDRunnableS0S0201000.i2, (Notification) iDRunnableS0S0201000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            iDRunnableS0S0201000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            iDRunnableS0S0201000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        C027909b c027909b = (C027909b) iDRunnableS0S0201000.l0;
        c027909b.LIZJ.LJ(iDRunnableS0S0201000.i2, iDRunnableS0S0201000.l1);
    }

    public static final void run$16(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            RecyclerView recyclerView = ((C35341a6) iDRunnableS0S0201000.l0).LJLJJL;
            if (recyclerView != null) {
                if (recyclerView.getParent() != null) {
                    ((C35341a6) iDRunnableS0S0201000.l0).notifyItemChanged(iDRunnableS0S0201000.i2, iDRunnableS0S0201000.l1);
                    return;
                }
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            ((TextView) iDRunnableS0S0201000.l0).setTypeface((Typeface) iDRunnableS0S0201000.l1, iDRunnableS0S0201000.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        boolean LIZ;
        try {
            iDRunnableS0S0201000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        switch (iDRunnableS0S0201000.i2) {
            case 0:
                iDRunnableS0S0201000.l0.getClass();
                Collections.emptyList();
                throw null;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) iDRunnableS0S0201000.l0;
                C67649Qgn c67649Qgn = (C67649Qgn) iDRunnableS0S0201000.l1;
                firebaseMessaging.getClass();
                try {
                    c67649Qgn.LIZIZ(firebaseMessaging.LIZ());
                    return;
                } catch (Exception e) {
                    c67649Qgn.LIZ(e);
                    return;
                }
            case 2:
                ((CommentListFragment) iDRunnableS0S0201000.l0).In((Comment) iDRunnableS0S0201000.l1);
                return;
            default:
                C48334Iy2 LIZ = C48334Iy2.LIZ((Context) iDRunnableS0S0201000.l0, (String) iDRunnableS0S0201000.l1);
                LIZ.LIZLLL++;
                if (!LIZ.LJ) {
                    LIZ.LJ = true;
                    LIZ.LIZJ = LIZ.LIZIZ(LIZ.LIZ, "entering");
                    return;
                }
                return;
        }
    }

    public static final void run$5(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        switch (iDRunnableS0S0201000.i2) {
            case 0:
                iDRunnableS0S0201000.l0.getClass();
                new ArrayList(0);
                throw null;
            case 1:
                ((InterfaceC47046IdG) iDRunnableS0S0201000.l0).onResult(iDRunnableS0S0201000.l1);
                return;
            case 2:
                Tracing tracing = (Tracing) iDRunnableS0S0201000.l0;
                Tracing.Event event = (Tracing.Event) iDRunnableS0S0201000.l1;
                tracing.getClass();
                if (event.LIZ) {
                    return;
                }
                event.LIZ = true;
                ((ArrayList) tracing.LIZ).add(event);
                Iterator it = ((HashSet) tracing.LIZIZ).iterator();
                while (it.hasNext()) {
                    InterfaceC37466En8 interfaceC37466En8 = (InterfaceC37466En8) it.next();
                    interfaceC37466En8.accept(event);
                    if (interfaceC37466En8.LIZIZ()) {
                        it.remove();
                    }
                }
                return;
            case 3:
                C78977Uz7.LJJLIIIIJ(new ARunnableS9S0201000_6(1, iDRunnableS0S0201000.l0, iDRunnableS0S0201000.l1, 10));
                return;
            default:
                C44298Ha2 c44298Ha2 = (C44298Ha2) iDRunnableS0S0201000.l0;
                Object obj = iDRunnableS0S0201000.l1;
                c44298Ha2.getClass();
                c44298Ha2.LJII(C78880UxY.LJLILLLLZI(obj));
                return;
        }
    }

    public static final void run$6(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        switch (iDRunnableS0S0201000.i2) {
            case 0:
                C0NB.LJ((String) iDRunnableS0S0201000.l0, (String) iDRunnableS0S0201000.l1);
                return;
            case 1:
                final C38065Ewn c38065Ewn = (C38065Ewn) iDRunnableS0S0201000.l0;
                final InterfaceC38069Ewr interfaceC38069Ewr = (InterfaceC38069Ewr) iDRunnableS0S0201000.l1;
                c38065Ewn.getClass();
                C38185Eyj c38185Eyj = new C38185Eyj();
                c38185Eyj.LIZJ(Boolean.FALSE, "fetch_permission_config");
                c38185Eyj.LIZ("label_enable_permission_check", C38113ExZ.LJIIIZ);
                c38065Ewn.LIZJ.getClass();
                new C38031EwF().LIZIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new InterfaceC38034EwI() { // from class: X.Ewl
                    @Override // X.InterfaceC38034EwI
                    public final void LIZ(String str) {
                        C38065Ewn c38065Ewn2 = C38065Ewn.this;
                        InterfaceC38069Ewr interfaceC38069Ewr2 = interfaceC38069Ewr;
                        c38065Ewn2.getClass();
                        if (TextUtils.isEmpty(str)) {
                            str = ((JsBridge2PermissionConfigurator) c38065Ewn2.LIZJ).LIZLLL();
                            C38065Ewn.LJ(str, "from_injection", null);
                        } else {
                            C38065Ewn.LJ(str, "from_storage", null);
                        }
                        c38065Ewn2.LIZLLL(true, str, interfaceC38069Ewr2);
                    }
                });
                return;
            default:
                Object obj = iDRunnableS0S0201000.l0;
                Object obj2 = iDRunnableS0S0201000.l1;
                ((HashMap) IJZ.LIZ).put(obj, new WeakReference(obj2));
                return;
        }
    }

    public static final void run$7(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        switch (iDRunnableS0S0201000.i2) {
            case 0:
                C0NB.LJIIIZ((String) iDRunnableS0S0201000.l0, (String) iDRunnableS0S0201000.l1);
                return;
            case 1:
                Q5F this$0 = (Q5F) iDRunnableS0S0201000.l0;
                Object bundle = iDRunnableS0S0201000.l1;
                if (C40700FyC.LIZ(Q5F.class)) {
                    return;
                }
                try {
                    o.LJIIIZ(this$0, "this$0");
                    o.LJIIIZ(bundle, "$bundle");
                    this$0.LIZIZ.getClass();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                ARunnableS25S0200000_6 aRunnableS25S0200000_6 = (ARunnableS25S0200000_6) iDRunnableS0S0201000.l0;
                ((C38334F2s) aRunnableS25S0200000_6.l1).LIZ.LIZJ(iDRunnableS0S0201000.l1);
                return;
        }
    }

    public static final void run$8(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        switch (iDRunnableS0S0201000.i2) {
            case 0:
                C0NB.LIZIZ((String) iDRunnableS0S0201000.l0, (String) iDRunnableS0S0201000.l1);
                return;
            default:
                C48202Ivu c48202Ivu = (C48202Ivu) iDRunnableS0S0201000.l0;
                EnumC111394Yt enumC111394Yt = (EnumC111394Yt) iDRunnableS0S0201000.l1;
                EnumC111394Yt enumC111394Yt2 = c48202Ivu.LIZJ;
                if (enumC111394Yt != enumC111394Yt2) {
                    c48202Ivu.LIZJ = enumC111394Yt;
                    Iterator<InterfaceC69602oG> it = c48202Ivu.LIZLLL.iterator();
                    while (it.hasNext()) {
                        it.next().onChange(enumC111394Yt2, c48202Ivu.LIZJ);
                    }
                    return;
                }
                return;
        }
    }

    public static final void run$9(IDRunnableS0S0201000 iDRunnableS0S0201000) {
        switch (iDRunnableS0S0201000.i2) {
            case 0:
                ((AbstractC06680Oa) iDRunnableS0S0201000.l0).LIZLLL((Typeface) iDRunnableS0S0201000.l1);
                return;
            default:
                TTVideoEngineImpl tTVideoEngineImpl = (TTVideoEngineImpl) iDRunnableS0S0201000.l0;
                Looper looper = (Looper) iDRunnableS0S0201000.l1;
                tTVideoEngineImpl.LLZL();
                VideoSurface videoSurface = tTVideoEngineImpl.O0;
                if (videoSurface != null) {
                    videoSurface.LJJI(looper);
                }
                TTVideoEngineLog.d("TTVideoEngine", "[SRLog]setupTextureRender in child thread");
                return;
        }
    }

    public IDRunnableS0S0201000(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
