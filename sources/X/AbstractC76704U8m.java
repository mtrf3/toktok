package X;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkSyncLayoutIdSeiSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.U8m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76704U8m {
    public final Context LIZ;
    public final U92 LIZIZ;
    public final U9E LIZJ;
    public volatile Layout LIZLLL;
    public volatile String LJ;
    public final CopyOnWriteArrayList<C76711U8t> LJFF;

    public final void LIZ() {
        C32014ChO.LIZJ(LIZJ(210), "clear", null);
        this.LIZLLL = null;
        this.LJ = null;
        Iterator<C76711U8t> it = this.LJFF.iterator();
        while (it.hasNext()) {
            C76711U8t next = it.next();
            SurfaceView surfaceView = next.LJLIL.LIZLLL;
            if (surfaceView != null) {
                C29306Beo.LJJIJIIJIL(surfaceView);
            }
            next.LJLIL.LIZLLL = null;
        }
        this.LJFF.clear();
    }

    public static String LIZJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_BaseDataProvider_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_BaseDataProvider_", i, LIZ2);
    }

    public final C76711U8t LIZIZ(EnumC75419Tip initState) {
        o.LJIIIZ(initState, "initState");
        return new C76711U8t(new C76701U8j(initState, null, null, null, null, null, 240), new FrameLayout(this.LIZ));
    }

    public final void LIZLLL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        String LIZJ = LIZJ(191);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeMicDataByLinkMicId linkMicId=");
        LIZ.append(linkMicId);
        C32014ChO.LJFF(LIZJ, X1D.LIZIZ(LIZ));
        Iterator<C76711U8t> it = this.LJFF.iterator();
        while (it.hasNext()) {
            C76711U8t next = it.next();
            if (o.LJ(next.LJLIL.LIZJ, linkMicId)) {
                if (next != null) {
                    this.LJFF.remove(next);
                    return;
                }
                return;
            }
        }
    }

    public final void LJ(Layout layout) {
        o.LJIIIZ(layout, "layout");
        String LIZJ = LIZJ(198);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLayout layout=");
        LIZ.append(layout);
        C32014ChO.LJFF(LIZJ, X1D.LIZIZ(LIZ));
        this.LIZLLL = layout;
        if (!this.LIZIZ.LJIIIZ() || LiveSdkSyncLayoutIdSeiSwitcherSetting.INSTANCE.isEnable()) {
            this.LJ = layout.getLayoutId();
        }
    }

    public boolean LJFF(C76701U8j c76701U8j, FrameLayout frameLayout) {
        boolean z;
        C76711U8t c76711U8t;
        C76701U8j c76701U8j2;
        String str;
        Long l;
        Long l2;
        boolean LJ;
        String str2;
        String str3;
        String LIZJ = LIZJ(166);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateOrInsertMicData data=");
        LIZ.append(c76701U8j);
        C32014ChO.LJFF(LIZJ, X1D.LIZIZ(LIZ));
        Iterator<C76711U8t> it = this.LJFF.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                c76711U8t = it.next();
                C76711U8t c76711U8t2 = c76711U8t;
                if (c76701U8j.LIZJ != null && c76711U8t2.LJLIL.LIZJ != null) {
                    String LIZJ2 = LIZJ(173);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("updateOrInsertMicData #");
                    LIZ2.append(c76701U8j.LIZJ);
                    LIZ2.append("# - #");
                    LIZ2.append(c76711U8t2.LJLIL.LIZJ);
                    LIZ2.append('#');
                    C32014ChO.LJFF(LIZJ2, X1D.LIZIZ(LIZ2));
                    String str4 = c76711U8t2.LJLIL.LIZJ;
                    if (str4 != null) {
                        str2 = s.LJZI(str4).toString();
                    } else {
                        str2 = null;
                    }
                    String str5 = c76701U8j.LIZJ;
                    if (str5 != null) {
                        str3 = s.LJZI(str5).toString();
                    } else {
                        str3 = null;
                    }
                    LJ = o.LJ(str2, str3);
                } else {
                    Long l3 = c76701U8j.LIZIZ;
                    if (l3 != null && (l2 = c76711U8t2.LJLIL.LIZIZ) != null) {
                        LJ = o.LJ(l2, l3);
                    }
                }
                if (LJ) {
                    break;
                }
            } else {
                c76711U8t = null;
                break;
            }
        }
        C76711U8t c76711U8t3 = c76711U8t;
        if (c76711U8t3 != null && (c76701U8j2 = c76711U8t3.LJLIL) != null) {
            EnumC75419Tip enumC75419Tip = c76701U8j2.LIZ;
            EnumC75419Tip enumC75419Tip2 = EnumC75419Tip.StateLinked;
            if ((enumC75419Tip == enumC75419Tip2 && c76701U8j.LIZ == EnumC75419Tip.StatePreparing) || (enumC75419Tip == enumC75419Tip2 && c76701U8j.LIZ == EnumC75419Tip.StateJoined)) {
                String LIZJ3 = LIZJ(223);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("no need update state because currentState is:");
                LIZ3.append(c76701U8j2.LIZ);
                LIZ3.append(", need update state is:");
                LIZ3.append(c76701U8j.LIZ);
                C32014ChO.LIZJ(LIZJ3, X1D.LIZIZ(LIZ3), null);
                return false;
            }
            if (c76701U8j2.LIZIZ == null && (l = c76701U8j.LIZIZ) != null) {
                c76701U8j2.LIZIZ = l;
            }
            if (c76701U8j2.LIZJ == null && (str = c76701U8j.LIZJ) != null) {
                c76701U8j2.LIZJ = str;
            }
            EnumC75419Tip enumC75419Tip3 = c76701U8j.LIZ;
            if (enumC75419Tip != enumC75419Tip3 && enumC75419Tip3 != null) {
                if (enumC75419Tip != null) {
                    c76701U8j2.LJFF = enumC75419Tip;
                }
                c76701U8j2.LIZ = enumC75419Tip3;
                z = true;
            }
            SurfaceView surfaceView = c76701U8j.LIZLLL;
            if (surfaceView != null) {
                c76701U8j2.LIZLLL = surfaceView;
                z = true;
            }
            WeakReference<ILayerControl.ILayer> weakReference = c76701U8j.LJ;
            if (weakReference != null) {
                c76701U8j2.LJ = weakReference;
                z = true;
            }
            String LIZJ4 = LIZJ(247);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(z);
            LIZ4.append(" update micinfo = ");
            LIZ4.append(c76701U8j2);
            C32014ChO.LJFF(LIZJ4, X1D.LIZIZ(LIZ4));
            return z;
        }
        CopyOnWriteArrayList<C76711U8t> copyOnWriteArrayList = this.LJFF;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(this.LIZ);
        }
        C76711U8t c76711U8t4 = new C76711U8t(c76701U8j, frameLayout);
        String LIZJ5 = LIZJ(179);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("updateOrInsertMicData micInfo = ");
        LIZ5.append(c76711U8t4);
        C32014ChO.LJFF(LIZJ5, X1D.LIZIZ(LIZ5));
        return copyOnWriteArrayList.add(c76711U8t4);
    }

    public AbstractC76704U8m(Context context, U92 positionManager, U9E mappingHelper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(positionManager, "positionManager");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        this.LIZ = context;
        this.LIZIZ = positionManager;
        this.LIZJ = mappingHelper;
        this.LJFF = new CopyOnWriteArrayList<>();
    }
}
