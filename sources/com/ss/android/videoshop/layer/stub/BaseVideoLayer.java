package com.ss.android.videoshop.layer.stub;

import X.C16880lQ;
import X.C64504PTg;
import X.C79985VaH;
import X.C87418YSo;
import X.EnumC47176IfM;
import X.InterfaceC48221IwD;
import X.KL2;
import X.UC0;
import X.YD6;
import X.YD8;
import X.YS2;
import X.YS3;
import X.YS4;
import X.YS6;
import X.YS7;
import X.YSA;
import X.YSD;
import X.YT4;
import X.YT5;
import X.YT7;
import X.YT8;
import X.YTB;
import X.YTC;
import X.YTD;
import X.YTE;
import X.YTF;
import X.YTH;
import X.YTK;
import X.YTL;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes16.dex */
public abstract class BaseVideoLayer implements YSA, Comparable<BaseVideoLayer>, WeakHandler.IHandler {
    public boolean activated;
    public YTH mLayerHost;
    public YTK mLayerStateInquirer;
    public Map<ViewGroup, List<View>> lastAddedViews = new HashMap();
    public WeakHandler handler = new WeakHandler(this);

    public YTK createLayerStateInquirer() {
        return null;
    }

    @Override // X.YSA
    public Set<Integer> getActivateEvents() {
        return null;
    }

    @Override // X.YSA
    public abstract /* synthetic */ ArrayList<Integer> getSupportEvents();

    public abstract /* synthetic */ int getZIndex();

    @Override // X.YSA
    public boolean handleVideoEvent(YT8 yt8) {
        return false;
    }

    @Override // X.YSA
    public boolean isShowing() {
        return false;
    }

    @Override // X.YSA
    public void onActivate(List<Integer> list, InterfaceC48221IwD interfaceC48221IwD) {
    }

    public List<Pair<View, RelativeLayout.LayoutParams>> onCreateView(Context context, LayoutInflater layoutInflater) {
        return null;
    }

    public Map<View, RelativeLayout.LayoutParams> onCreateView(Context context) {
        return null;
    }

    public InterfaceC48221IwD getVideoStateInquirer() {
        YTH yth = this.mLayerHost;
        if (yth != null) {
            return ((YS6) yth).LIZLLL();
        }
        return null;
    }

    @Override // X.YSA
    public boolean hasUI() {
        List<View> list = this.lastAddedViews.get(getLayerMainContainer());
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void removeAllView() {
        for (Map.Entry<ViewGroup, List<View>> entry : this.lastAddedViews.entrySet()) {
            if (entry.getValue() != null) {
                Iterator<View> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    KL2.LIZIZ(it.next());
                }
            }
        }
        this.lastAddedViews.clear();
    }

    public void addViews() {
        Context context = getContext();
        List<Pair<View, RelativeLayout.LayoutParams>> onCreateView = onCreateView(context, getInflater(context));
        if (onCreateView != null && !onCreateView.isEmpty()) {
            for (Pair<View, RelativeLayout.LayoutParams> pair : onCreateView) {
                if (pair != null) {
                    addView2Host((View) pair.first, getLayerMainContainer(), (ViewGroup.LayoutParams) pair.second);
                }
            }
            return;
        }
        Map<View, RelativeLayout.LayoutParams> onCreateView2 = onCreateView(getContext());
        if (onCreateView2 == null || onCreateView2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : new HashMap(onCreateView2).entrySet()) {
            addView2Host((View) entry.getKey(), getLayerMainContainer(), (ViewGroup.LayoutParams) entry.getValue());
        }
    }

    public C79985VaH getBindPlayEntity() {
        YS3 ys3;
        YTH host = getHost();
        if (host != null && (ys3 = ((YS6) host).LJFF) != null) {
            return ys3.getBindPlayEntity();
        }
        return null;
    }

    public Context getContext() {
        YS3 ys3;
        if (getHost() != null && (ys3 = ((YS6) getHost()).LJFF) != null) {
            return ys3.getContext();
        }
        return null;
    }

    public Object getData() {
        getHost();
        return null;
    }

    public ViewGroup getLayerMainContainer() {
        YS3 ys3;
        YTH host = getHost();
        if (host != null && (ys3 = ((YS6) host).LJFF) != null) {
            return ys3.getLayerMainContainer();
        }
        return null;
    }

    public ViewGroup getLayerRootContainer() {
        YS3 ys3;
        YTH host = getHost();
        if (host != null && (ys3 = ((YS6) host).LJFF) != null) {
            return ys3.getLayerRootContainer();
        }
        return null;
    }

    @Override // X.YSA
    public int getLayerType() {
        return getZIndex();
    }

    public Lifecycle getObservedLifecycle() {
        YS3 ys3;
        YTH host = getHost();
        if (host != null && (ys3 = ((YS6) host).LJFF) != null) {
            return ys3.getObservedLifecycle();
        }
        return null;
    }

    public C79985VaH getPlayEntity() {
        YS3 ys3;
        YTH host = getHost();
        if (host != null && (ys3 = ((YS6) host).LJFF) != null) {
            return ys3.getPlayEntity();
        }
        return null;
    }

    public YTH getHost() {
        return this.mLayerHost;
    }

    public WeakHandler getInternalHandler() {
        return this.handler;
    }

    @Override // X.YSA
    public YTK getLayerStateInquirer() {
        return this.mLayerStateInquirer;
    }

    @Override // X.YSA
    public boolean isActivated() {
        return this.activated;
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseVideoLayer baseVideoLayer) {
        if (baseVideoLayer == null || getZIndex() > baseVideoLayer.getZIndex()) {
            return 1;
        }
        if (getZIndex() < baseVideoLayer.getZIndex()) {
            return -1;
        }
        return 0;
    }

    public void execCommand(YTL ytl) {
        YS3 ys3;
        YS7 ys7;
        YS7 ys72;
        YTH yth = this.mLayerHost;
        if (yth == null || (ys3 = ((YS6) yth).LJFF) == null || ytl == null) {
            return;
        }
        VideoContext videoContext = ys3.LLIILZL;
        boolean z = false;
        if (videoContext != null && videoContext.isCurrentSource(ys3.LJLJJLL) && ys3.LLIILZL.onExecCommand(ys3.getVideoStateInquirer(), ys3.LJLJJLL, ytl)) {
            return;
        }
        int i = ((YT5) ytl).LIZ;
        if (i != 209) {
            if (i == 208) {
                VideoContext videoContext2 = ys3.LLIILZL;
                if (videoContext2 == null) {
                    return;
                }
                videoContext2.pause();
                return;
            }
            if (i == 207 || i == 214) {
                YS4 parentView = ys3.getParentView();
                if (parentView != null) {
                    parentView.LJFF();
                    return;
                }
                VideoContext videoContext3 = ys3.LLIILZL;
                if (videoContext3 == null) {
                    return;
                }
                videoContext3.play();
                return;
            }
            if (i == 103 || i == 102) {
                VideoContext videoContext4 = ys3.LLIILZL;
                if (videoContext4 == null) {
                    return;
                }
                videoContext4.enterFullScreen();
                return;
            }
            if (i == 104) {
                VideoContext videoContext5 = ys3.LLIILZL;
                if (videoContext5 == null) {
                    return;
                }
                videoContext5.exitFullScreen();
                return;
            }
            if (i != 213) {
                if (i == 211) {
                    if (ytl instanceof YT4) {
                        z = "".equals(((YT4) ytl).LIZIZ);
                    }
                    if (TextUtils.isEmpty(null)) {
                        return;
                    }
                    EnumC47176IfM LIZIZ = UC0.LIZIZ(null);
                    YS7 ys73 = ys3.LJLL;
                    if (ys73 == null) {
                        return;
                    }
                    ys73.setResolution(LIZIZ, z);
                    return;
                }
                if (i == 217 || i == 216 || i == 218) {
                    return;
                }
                if (i == 219) {
                    if (!(ytl instanceof YT7) || (ys72 = ys3.LJLL) == null) {
                        return;
                    }
                    ys72.setEngineOption(0, null);
                    return;
                }
                if (i == 220 || i == 221) {
                    return;
                }
                if (i == 222) {
                    if (!(ytl instanceof YTC) || TextUtils.isEmpty(null) || (ys7 = ys3.LJLL) == null) {
                        return;
                    }
                    ys7.configResolutionByQuality(false, null, false, "byUser".equals(null), null);
                    return;
                }
                if (i == 223) {
                    return;
                }
                if (i == 400) {
                    if (!(ytl instanceof YTB)) {
                        return;
                    }
                    YSD ysd = ys3.LJLILLLLZI;
                    if (ysd != null) {
                        Object videoView = ysd.getVideoView();
                        if (videoView instanceof YD8) {
                            ViewGroup.LayoutParams layoutParams = ys3.LJLILLLLZI.getLayoutParams();
                            if (layoutParams instanceof FrameLayout.LayoutParams) {
                                YS2.LJJII((FrameLayout.LayoutParams) layoutParams);
                            }
                        } else if (videoView instanceof YD6) {
                            ViewGroup.LayoutParams layoutParams2 = ((View) videoView).getLayoutParams();
                            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                                YS2.LJJII((FrameLayout.LayoutParams) layoutParams2);
                            }
                        }
                    }
                    ys3.LLIIIILZ.LJ(new C87418YSo());
                    return;
                }
                if (i == 401) {
                    TTVideoEngine videoEngine = ys3.getVideoEngine();
                    if (!(ytl instanceof YTF) || videoEngine != null) {
                    }
                    return;
                } else {
                    if (i == 402) {
                        TTVideoEngine videoEngine2 = ys3.getVideoEngine();
                        if (!(ytl instanceof YTD) || videoEngine2 == null) {
                            return;
                        }
                        videoEngine2.LJJJJJ();
                        return;
                    }
                    if (i != 403) {
                        return;
                    }
                    TTVideoEngine videoEngine3 = ys3.getVideoEngine();
                    if (!(ytl instanceof YTE) || videoEngine3 == null) {
                        return;
                    }
                    videoEngine3.LLJJLIIIJLLLLLLLZ();
                    return;
                }
            }
            throw null;
        }
        throw null;
    }

    public <T> T getData(Class<T> cls) {
        if (getHost() != null && cls != null) {
            cls.isInstance(null);
        }
        return null;
    }

    @Override // X.YSA
    public View getFirstAddedViewForGroup(ViewGroup viewGroup) {
        List<View> list = this.lastAddedViews.get(viewGroup);
        if (list != null && !list.isEmpty()) {
            return (View) C64504PTg.LIZIZ(list, -1, list);
        }
        return null;
    }

    public LayoutInflater getInflater(Context context) {
        if (context == null) {
            return null;
        }
        return C16880lQ.LLZIL(context);
    }

    @Override // X.YSA
    public View getLastAddedViewForGroup(ViewGroup viewGroup) {
        List<View> list = this.lastAddedViews.get(viewGroup);
        if (list != null && !list.isEmpty()) {
            return (View) ListProtector.get(list, 0);
        }
        return null;
    }

    public <T extends YTK> T getLayerStateInquirer(Class<T> cls) {
        YTH yth = this.mLayerHost;
        if (yth == null) {
            return null;
        }
        YS6 ys6 = (YS6) yth;
        if (cls == null) {
            ys6.getClass();
            return null;
        }
        if (((HashMap) ys6.LJI).containsKey(cls)) {
            return (T) ((HashMap) ys6.LJI).get(cls);
        }
        for (T t : ((HashMap) ys6.LJI).values()) {
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i == 100) {
            this.handler.removeMessages(100);
            removeAllView();
        } else {
            if (i != 101) {
                return;
            }
            Object obj = message.obj;
            if (!(obj instanceof View)) {
                return;
            }
            KL2.LIZIZ((View) obj);
        }
    }

    public boolean isLayerShowing(List<Integer> list) {
        YSA ysa;
        if (list != null && this.mLayerHost != null) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                SparseArray<YSA> sparseArray = ((YS6) this.mLayerHost).LIZJ;
                if (sparseArray != null && (ysa = sparseArray.get(intValue)) != null && ysa.isShowing()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean notifyEvent(YT8 yt8) {
        YTH yth = this.mLayerHost;
        if (yth != null && ((YS6) yth).LJ(yt8)) {
            return true;
        }
        return false;
    }

    @Override // X.YSA
    public void onRegister(YTH yth) {
        setHost(yth);
        addViews();
        this.mLayerStateInquirer = createLayerStateInquirer();
    }

    @Override // X.YSA
    public void onUnregister(YTH yth) {
        removeAllView();
    }

    public void removeViewFromHost(View view) {
        ViewParent viewParent;
        List<View> list;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof ViewGroup) && (list = this.lastAddedViews.get(viewParent)) != null) {
            list.remove(view);
            if (list.isEmpty()) {
                this.lastAddedViews.remove(viewParent);
            }
        }
        KL2.LIZIZ(view);
    }

    @Override // X.YSA
    public void setActivated(boolean z) {
        this.activated = z;
    }

    public void setHost(YTH yth) {
        this.mLayerHost = yth;
    }

    public boolean isLayerShowing(int... iArr) {
        YSA ysa;
        if (iArr != null && this.mLayerHost != null) {
            for (int i : iArr) {
                SparseArray<YSA> sparseArray = ((YS6) this.mLayerHost).LIZJ;
                if (sparseArray != null && (ysa = sparseArray.get(i)) != null && ysa.isShowing()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int findPositionForChild(View view, ViewGroup viewGroup) {
        if (view == null || viewGroup == null) {
            return -2;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (view == viewGroup.getChildAt(i)) {
                return i;
            }
        }
        return -2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r1 < 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if (r1 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        r1 = r7.getChildCount();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addView2Host(android.view.View r6, android.view.ViewGroup r7, android.view.ViewGroup.LayoutParams r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L10
            if (r7 == 0) goto L10
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto L10
            X.YTH r0 = r5.getHost()
            if (r0 != 0) goto L11
        L10:
            return
        L11:
            android.view.View r0 = r5.getLastAddedViewForGroup(r7)
            int r0 = r5.findPositionForChild(r0, r7)
            int r1 = r0 + 1
            r3 = 0
            if (r1 >= 0) goto L63
            X.YTH r4 = r5.getHost()
            X.YS6 r4 = (X.YS6) r4
            r4.getClass()
            java.util.TreeSet<X.YSA> r0 = r4.LJ
            if (r0 == 0) goto L10
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L10
            java.util.TreeSet<X.YSA> r0 = r4.LJ
            java.lang.Object r1 = r0.lower(r5)
            X.YSA r1 = (X.YSA) r1
        L39:
            if (r1 == 0) goto L90
            boolean r0 = r1.hasUI()
            if (r0 != 0) goto L4a
            java.util.TreeSet<X.YSA> r0 = r4.LJ
            java.lang.Object r1 = r0.lower(r1)
            X.YSA r1 = (X.YSA) r1
            goto L39
        L4a:
            android.view.View r2 = r1.getLastAddedViewForGroup(r7)
            if (r2 == 0) goto L90
            r1 = 0
        L51:
            int r0 = r7.getChildCount()
            if (r1 >= r0) goto L90
            android.view.View r0 = r7.getChildAt(r1)
            if (r2 != r0) goto L8d
            if (r1 < 0) goto L90
            int r1 = r1 + 1
        L61:
            if (r1 < 0) goto L10
        L63:
            if (r8 == 0) goto L89
            r7.addView(r6, r1, r8)
        L68:
            java.util.Map<android.view.ViewGroup, java.util.List<android.view.View>> r0 = r5.lastAddedViews
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L83
            java.util.Map<android.view.ViewGroup, java.util.List<android.view.View>> r0 = r5.lastAddedViews
            java.lang.Object r1 = r0.get(r7)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L10
        L7a:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, r3, r6)
            java.util.Map<android.view.ViewGroup, java.util.List<android.view.View>> r0 = r5.lastAddedViews
            r0.put(r7, r1)
            goto L10
        L83:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L7a
        L89:
            r7.addView(r6, r1)
            goto L68
        L8d:
            int r1 = r1 + 1
            goto L51
        L90:
            java.util.TreeSet<X.YSA> r0 = r4.LJ
            java.lang.Object r1 = r0.higher(r5)
            X.YSA r1 = (X.YSA) r1
        L98:
            if (r1 == 0) goto Lc2
            boolean r0 = r1.hasUI()
            if (r0 != 0) goto La9
            java.util.TreeSet<X.YSA> r0 = r4.LJ
            java.lang.Object r1 = r0.higher(r1)
            X.YSA r1 = (X.YSA) r1
            goto L98
        La9:
            android.view.View r2 = r1.getFirstAddedViewForGroup(r7)
            if (r2 == 0) goto Lc2
            r1 = 0
        Lb0:
            int r0 = r7.getChildCount()
            if (r1 >= r0) goto Lc2
            android.view.View r0 = r7.getChildAt(r1)
            if (r2 != r0) goto Lbf
            if (r1 < 0) goto Lc2
            goto L63
        Lbf:
            int r1 = r1 + 1
            goto Lb0
        Lc2:
            int r1 = r7.getChildCount()
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.layer.stub.BaseVideoLayer.addView2Host(android.view.View, android.view.ViewGroup, android.view.ViewGroup$LayoutParams):void");
    }
}
