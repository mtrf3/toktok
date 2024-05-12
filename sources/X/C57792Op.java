package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.2Op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57792Op {
    public static int LJFF;
    public static int LJIIIIZZ;
    public static Aweme LJIIIZ;
    public final WeakReference<IDR> LIZ;
    public final WeakReference<C54258LRe> LIZIZ;
    public NotInterestedTutorialData LIZJ;
    public static final Keva LIZLLL = Keva.getRepo("not_interested_tutorial");
    public static final HashSet<Integer> LJ = new HashSet<>();
    public static int LJI = 2;
    public static long LJII = -1;

    public C57792Op(WeakReference<IDR> weakReference, WeakReference<C54258LRe> weakReference2) {
        IDR idr;
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        this.LIZ = weakReference;
        this.LIZIZ = weakReference2;
        Keva keva = LIZLLL;
        LJIIIIZZ = keva.getInt("total_video_count", 0);
        if (!keva.getBoolean("has_not_interested_tutorial_shown", false) && LJIIIIZZ < 100 && (idr = weakReference.get()) != null && (fragment = idr.getFragment()) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            final NotInterestedViewModel notInterestedViewModel = (NotInterestedViewModel) ViewModelProviders.of(mo49getActivity).get(NotInterestedViewModel.class);
            LJII = System.currentTimeMillis();
            PluginService.createIPluginServicebyMonsterPlugin(false).observe(EnumC35839E4t.VIDEO_TUTORIAL_DATA, mo49getActivity, new AbstractC73391SrD<E4G>() { // from class: X.2Oq
                @Override // X.InterfaceC116954iR
                public final void onComplete() {
                }

                @Override // X.InterfaceC116954iR
                public final void onError(Throwable e) {
                    o.LJIIIZ(e, "e");
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                @Override // X.InterfaceC116954iR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onNext(java.lang.Object r5) {
                    /*
                        r4 = this;
                        X.E4G r5 = (X.E4G) r5
                        java.lang.String r0 = "plugin"
                        kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                        X.2Op r3 = X.C57792Op.this
                        com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r5.getValue()
                        if (r0 == 0) goto L25
                        com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData r2 = r0.notInterestedTutorialData
                        if (r2 == 0) goto L25
                        com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel r1 = r2
                        X.2bi r0 = X.C56172Ij.LIZ(r2)
                        if (r0 == 0) goto L25
                        java.lang.String r0 = r2.title
                        if (r0 == 0) goto L25
                        boolean r0 = ujb.o.LJJJJJL(r0)
                        if (r0 == 0) goto L3b
                    L25:
                        r2 = 0
                    L26:
                        r3.LIZJ = r2
                        X.2Op r0 = X.C57792Op.this
                        com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData r0 = r0.LIZJ
                        if (r0 == 0) goto L38
                        java.lang.Integer r0 = r0.skipVideoCount
                        if (r0 == 0) goto L39
                        int r0 = r0.intValue()
                    L36:
                        X.C57792Op.LJI = r0
                    L38:
                        return
                    L39:
                        r0 = 2
                        goto L36
                    L3b:
                        java.lang.String r0 = r2.notInterestedText
                        if (r0 == 0) goto L25
                        boolean r0 = ujb.o.LJJJJJL(r0)
                        if (r0 == 0) goto L46
                        goto L25
                    L46:
                        java.lang.String r0 = r2.button
                        if (r0 == 0) goto L25
                        boolean r0 = ujb.o.LJJJJJL(r0)
                        if (r0 == 0) goto L51
                        goto L25
                    L51:
                        r1.getClass()
                        androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData> r0 = r1.LJLIL
                        r0.postValue(r2)
                        goto L26
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C57802Oq.onNext(java.lang.Object):void");
                }
            });
        }
    }
}
