package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.util.LruCache;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182427Dy extends FrameLayout implements GenericLifecycleObserver, Observer, LifecycleOwner {
    public static final /* synthetic */ int LJLLJ = 0;
    public final C62822Ol8 LJLIL;
    public Aweme LJLILLLLZI;
    public M89 LJLJI;
    public final C62822Ol8 LJLJJI;
    public ViewPropertyAnimator LJLJJL;
    public ViewPropertyAnimator LJLJJLL;
    public final AccelerateDecelerateInterpolator LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy(lifecycleOwner);
        }
    }

    private final VideoViewerListVM.BubbleVideoViewerViewModel getVm() {
        return (VideoViewerListVM.BubbleVideoViewerViewModel) this.LJLIL.getValue();
    }

    public final void LJFF() {
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("entrance refresh fetchVideoViewerList ");
            LIZ.append(aweme.getAid());
            C71Y.LIZLLL("VideoViewerEntrance", X1D.LIZIZ(LIZ));
            VideoViewerListVM.BubbleVideoViewerViewModel vm = getVm();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aid");
            vm.lv0(aid, new PaginationCursor(0L, 0L), C77P.ENTRANCE.getValue());
        }
    }

    public final LruCache<String, ViewerListResponse> getAidViewerListCache() {
        return (LruCache) this.LJLJJI.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        Lifecycle lifecycle = LJJIFFI.getLifecycle();
        o.LJIIIIZZ(lifecycle, "context.fragmentActivity!!.lifecycle");
        return lifecycle;
    }

    public final long getPrivacyStartTime() {
        return this.LJLL;
    }

    public final long getViewEntranceStartTime() {
        return this.LJLLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C182427Dy(Context context) {
        super(context, null, 0);
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(context, 1514));
        this.LJLJJI = C221108m2.LIZIZ(C78X.LJLIL);
        this.LJLJL = new AccelerateDecelerateInterpolator();
        this.LJLJLLL = true;
        FrameLayout.inflate(context, R.layout.rb, this);
        VideoViewerListVM.BubbleVideoViewerViewModel vm = getVm();
        vm.iv0("REFRESH_ENTRANCE_VIDEO_VIEW_SUCCESS", this, false);
        vm.iv0("REFRESH_ENTRANCE_VIDEO_VIEW_FAIL", this, false);
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x047f, code lost:
    
        if (r6 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        if (X.C53578L1a.LIZ() == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse r26) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182427Dy.LJI(com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse):void");
    }

    @QD3
    public final void onAuthChangeEvent(C1809278e c1809278e) {
        if (c1809278e != null && c1809278e.LJLILLLLZI) {
            LJFF();
        }
    }

    @QD3
    public final void onBlockUserEvent(C175046tw c175046tw) {
        String str;
        String str2;
        if (c175046tw == null) {
            return;
        }
        LruCache<String, ViewerListResponse> aidViewerListCache = getAidViewerListCache();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        List<User> viewerList = aidViewerListCache.get(str).getViewerList();
        if (viewerList != null) {
            Iterator<User> it = viewerList.iterator();
            while (it.hasNext()) {
                String uid = it.next().getUid();
                User user = c175046tw.LJLIL;
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                if (o.LJ(uid, str2)) {
                    LJFF();
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        C207668Da c207668Da = (C207668Da) obj;
        String str4 = null;
        if (c207668Da != null) {
            str = c207668Da.LIZ;
        } else {
            str = null;
        }
        C71Y.LIZLLL("VideoViewerEntrance", String.valueOf(str));
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
        }
        if (c207668Da == null || (str2 = c207668Da.LIZ) == null || str2.hashCode() != 909926994 || !str2.equals("REFRESH_ENTRANCE_VIDEO_VIEW_SUCCESS")) {
            LJI(null);
            return;
        }
        Object obj2 = c207668Da.LIZIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        OSZ osz = (OSZ) obj2;
        Object first = osz.getFirst();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        if (!o.LJ(first, str3)) {
            return;
        }
        ViewerListResponse viewerListResponse = (ViewerListResponse) osz.getSecond();
        LruCache<String, ViewerListResponse> aidViewerListCache = getAidViewerListCache();
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        aidViewerListCache.put(str4, viewerListResponse);
        LJI(viewerListResponse);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate ");
        LIZ.append(owner);
        C71Y.LIZLLL("VideoViewerEntrance", X1D.LIZIZ(LIZ));
        C42625Go9.LIZIZ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy ");
        LIZ.append(owner);
        C71Y.LIZLLL("VideoViewerEntrance", X1D.LIZIZ(LIZ));
        C42625Go9.LIZJ(this);
    }

    @QD3
    public final void onSavaAuthStatusWhenDialogIsClosed(C182407Dw c182407Dw) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSavaAuthStatusWhenDialogIsClosed ");
        LIZ.append((Object) null);
        C71Y.LIZLLL("VideoViewerEntrance", X1D.LIZIZ(LIZ));
    }

    public final void setPrivacyStartTime(long j) {
        this.LJLL = j;
    }

    public final void setViewEntranceStartTime(long j) {
        this.LJLLI = j;
    }

    public final void LIZIZ(Aweme aweme, M89 m89) {
        long j;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        if (aweme == null) {
            return;
        }
        Aweme aweme2 = this.LJLILLLLZI;
        String str = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        }
        if (o.LJ(str, aweme.getAid())) {
            return;
        }
        C71Y.LIZLLL("VideoViewerEntrance", "bind entrance ");
        this.LJLILLLLZI = aweme;
        this.LJLJI = m89;
        Object context = getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        boolean z = false;
        if (m89 != null && m89.getShowPlaylistViewerEntrance()) {
            z = true;
        }
        if (!z) {
            boolean z2 = this.LJLJLLL;
            ViewPropertyAnimator viewPropertyAnimator = this.LJLJJLL;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.LJLJJL;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            ViewPropertyAnimator alpha = animate().setInterpolator(this.LJLJL).alpha(0.0f);
            if (z2) {
                j = 0;
            } else {
                j = 150;
            }
            ViewPropertyAnimator duration = alpha.setDuration(j);
            this.LJLJJL = duration;
            if (duration != null) {
                duration.start();
            }
        }
        long LJ = C7GH.LJ(aweme);
        if (!C7GH.LJI() || !C7GH.LJIIJ(aweme) || LJ <= 0) {
            postDelayed(new ARunnableS22S0200000_3(this, aweme, 8), 400L);
        } else {
            LJFF();
        }
    }

    public final void LIZLLL(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        long j;
        if (z) {
            j = this.LJLL;
        } else {
            j = this.LJLLI;
        }
        if (System.currentTimeMillis() - j > 500) {
            interfaceC65784Pro.invoke();
        }
        if (z) {
            this.LJLL = System.currentTimeMillis();
        } else {
            this.LJLLI = System.currentTimeMillis();
        }
    }

    public final void LIZJ(long j, boolean z, boolean z2, String str) {
        String str2;
        String str3;
        M89 m89 = this.LJLJI;
        String str4 = null;
        if (m89 != null) {
            str2 = m89.getEventType();
        } else {
            str2 = null;
        }
        M89 m892 = this.LJLJI;
        if (m892 != null) {
            str4 = m892.getFromGroupId();
        }
        if (C54838Lfe.LJIIZILJ(this.LJLILLLLZI)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("group_id", str4);
        c188727au.LJ(j, "views_cnt");
        c188727au.LIZLLL(z ? 1 : 0, "video_views_status");
        c188727au.LIZLLL(z2 ? 1 : 0, "is_seven_days");
        c188727au.LJIIIZ("story_type", str3);
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
