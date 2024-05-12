package com.bytedance.poplayer.core;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C141335gf;
import X.C221108m2;
import X.C36635EZj;
import X.C39519Ff9;
import X.C3C5;
import X.C44384HbQ;
import X.C54081LKj;
import X.C54082LKk;
import X.C56309M8b;
import X.C56311M8d;
import X.C56315M8h;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C77412UZs;
import X.EnumC56312M8e;
import X.EnumC56313M8f;
import X.EnumC56314M8g;
import X.InterfaceC55641Lsb;
import X.InterfaceC55643Lsd;
import X.InterfaceC56316M8i;
import X.InterfaceC56317M8j;
import X.InterfaceC56318M8k;
import X.InterfaceC56321M8n;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceRunnableC56320M8m;
import X.M72;
import X.M74;
import X.M76;
import X.M77;
import X.M78;
import X.M7A;
import X.ORZ;
import X.RunnableC55747LuJ;
import X.X1D;
import Y.ARunnableS13S0400000_9;
import Y.ARunnableS20S0300000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDCListenerS116S0200000_9;
import Y.IDLListenerS60S0200000_9;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.poplayer.IPopupTask;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopupTaskExecutor implements InterfaceRunnableC56320M8m, InterfaceC88471Ynr<M7A, M7A, C76800UCe> {
    public static final Method LJLJLJ;
    public final C54082LKk LJLIL;
    public final InterfaceC55643Lsd LJLILLLLZI;
    public final CopyOnWriteArrayList<C56309M8b> LJLJI;
    public volatile boolean LJLJJI;
    public final AtomicBoolean LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public C56309M8b LJLJL;

    static {
        Method method;
        Method[] declaredMethods = IPopupTask.class.getDeclaredMethods();
        o.LJIIIIZZ(declaredMethods, "IPopupTask::class.java.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i < length) {
                method = declaredMethods[i];
                if (o.LJ(method.getName(), "getRootView")) {
                    break;
                } else {
                    i++;
                }
            } else {
                method = null;
                break;
            }
        }
        LJLJLJ = method;
    }

    public final void LIZ() {
        if (!this.LJLJJL.get()) {
            return;
        }
        CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList = this.LJLJI;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<C56309M8b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                M7A state = it.next().LJLJJLL.getState();
                o.LJIIIZ(state, "<this>");
                if (state == M7A.PENDING || state == M7A.SHOWED) {
                    return;
                }
            }
        }
        this.LJLJJL.set(false);
        InterfaceC55643Lsd scene = this.LJLILLLLZI;
        o.LJIIIZ(scene, "scene");
        PopupManager.LIZJ.remove(scene);
        PopupManager.LIZLLL.remove(scene);
        PopupManager.LJ.remove(scene);
        C77412UZs.LJJIL(this.LJLJI);
        ((Handler) this.LJLJJLL.getValue()).post(RunnableC55747LuJ.LJLIL);
    }

    public final void LJFF() {
        Object LIZ;
        C54082LKk c54082LKk;
        Activity activity;
        C54082LKk popupContext;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ActivityC45651qj LIZJ;
        synchronized (this.LJLJI) {
            LIZ();
            try {
                LIZ = (C56309M8b) ORZ.LJLLLL(this.LJLJI);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Lifecycle.State state = null;
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            C56309M8b c56309M8b = (C56309M8b) LIZ;
            this.LJLJL = c56309M8b;
            if (c56309M8b != null) {
                this.LJLJI.remove(c56309M8b);
                InterfaceC56321M8n interfaceC56321M8n = c56309M8b.LJLJJLL;
                if (interfaceC56321M8n instanceof InterfaceC55641Lsb) {
                    InterfaceC65784Pro<Activity> interfaceC65784Pro = PopupManager.LIZLLL().LIZLLL;
                    if (interfaceC65784Pro != null) {
                        activity = interfaceC65784Pro.invoke();
                    } else {
                        activity = null;
                    }
                    C54082LKk popupContext2 = ((InterfaceC55641Lsb) interfaceC56321M8n).getPopupContext();
                    if (popupContext2 != null && popupContext2.LIZJ() != null && ((popupContext = ((InterfaceC55641Lsb) interfaceC56321M8n).getPopupContext()) == null || (LIZJ = popupContext.LIZJ()) == null || !LIZJ.isDestroyed())) {
                        C54082LKk popupContext3 = ((InterfaceC55641Lsb) interfaceC56321M8n).getPopupContext();
                        if (popupContext3 != null && (lifecycleOwner = popupContext3.LIZIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                            state = lifecycle.getCurrentState();
                        }
                        if (state != Lifecycle.State.DESTROYED) {
                            c54082LKk = ((InterfaceC55641Lsb) interfaceC56321M8n).getPopupContext();
                        }
                    }
                    if (activity instanceof ActivityC45651qj) {
                        c54082LKk = C54081LKj.LIZ(activity, (LifecycleOwner) activity);
                    }
                    LJFF();
                } else {
                    c54082LKk = this.LJLIL;
                }
                if (c54082LKk != null) {
                    LIZIZ(c56309M8b, c54082LKk);
                }
                LJFF();
            }
        }
    }

    @Override // X.InterfaceRunnableC56320M8m
    public final boolean isRunning() {
        return this.LJLJJL.get();
    }

    public final void LIZJ() {
        PopupManager.LIZLLL().LJII.execute(new ARunnableS45S0100000_9(this, 12));
    }

    @Override // X.InterfaceRunnableC56320M8m
    public final void interrupt() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLILLLLZI.getSceneId());
        LIZ.append(" is interrupted.");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
        this.LJLJJI = true;
        this.LJLJJL.set(false);
        C77412UZs.LJJIL(this.LJLJI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLILLLLZI.getSceneId());
        LIZ.append(" start run...");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
        LJFF();
    }

    public final void LIZIZ(C56309M8b c56309M8b, C54082LKk c54082LKk) {
        InterfaceC56317M8j interfaceC56317M8j;
        String str;
        String str2;
        c56309M8b.LJLJJLL.getClass();
        boolean canShow = c56309M8b.LJLIL.canShow();
        if (!PopupManager.LJIIIZ.get()) {
            if (c56309M8b.LJLJJI.isSceneActive() && canShow) {
                c56309M8b.LJLJJLL.getClass();
                if (c56309M8b.LJLJJLL.getState() == M7A.PENDING) {
                    if (o.LJ(c56309M8b.LJLJJL, M77.LIZ)) {
                        M74 m74 = c56309M8b.LJLJJLL;
                        EnumC56313M8f enumC56313M8f = EnumC56313M8f.DEPENDENCY;
                        int errCode = enumC56313M8f.getErrCode();
                        EnumC56312M8e enumC56312M8e = EnumC56312M8e.DEPENDENCY;
                        m74.showPopupFailed(errCode, enumC56312M8e.getErrMsg());
                        InterfaceC56318M8k interfaceC56318M8k = PopupManager.LIZLLL().LJ;
                        if (interfaceC56318M8k != null) {
                            M74 m742 = c56309M8b.LJLJJLL;
                            enumC56313M8f.getErrCode();
                            interfaceC56318M8k.LIZIZ(m742, enumC56312M8e.getErrMsg());
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(c56309M8b.LJLILLLLZI);
                        LIZ.append(" is ignored because of the Never dependency.");
                        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
                        C56311M8d.LIZIZ(c56309M8b, EnumC56314M8g.POPUP_DEPENDENCY, c56309M8b.LJLJJI.getSceneId(), "Never Dependency", null);
                        M78 stateWrapper = c56309M8b.LJLJJLL.getStateWrapper();
                        stateWrapper.getClass();
                        stateWrapper.LIZJ(M7A.IGNORED);
                    } else {
                        M76 m76 = c56309M8b.LJLJJL;
                        if (!(m76 instanceof C36635EZj)) {
                            InterfaceC56321M8n interfaceC56321M8n = c56309M8b.LJLJJLL;
                            if (interfaceC56321M8n instanceof InterfaceC56316M8i) {
                                o.LJII(interfaceC56321M8n, "null cannot be cast to non-null type com.bytedance.poplayer.IAsyncTask");
                                InterfaceC56316M8i interfaceC56316M8i = (InterfaceC56316M8i) interfaceC56321M8n;
                                interfaceC56316M8i.LJII().set(true);
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                interfaceC56316M8i.LIZJ(new AqS140S0200000_9(c56309M8b, countDownLatch, 78));
                                PopupManager.LIZLLL().LJII.execute(new ARunnableS20S0300000_9(c56309M8b, interfaceC56316M8i, c54082LKk, 9));
                                interfaceC56316M8i.LIZ();
                                if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                                    if (this.LJLJJI) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(c56309M8b.LJLILLLLZI);
                                        LIZ2.append(" stopped because it is interrupted.");
                                        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
                                    }
                                    if (!this.LJLJJI) {
                                        if (!interfaceC56316M8i.LJFF().get()) {
                                            M74 m743 = c56309M8b.LJLJJLL;
                                            EnumC56313M8f enumC56313M8f2 = EnumC56313M8f.ASYNC_FALSE;
                                            int errCode2 = enumC56313M8f2.getErrCode();
                                            EnumC56312M8e enumC56312M8e2 = EnumC56312M8e.ASYNC_FALSE;
                                            m743.showPopupFailed(errCode2, enumC56312M8e2.getErrMsg());
                                            InterfaceC56318M8k interfaceC56318M8k2 = PopupManager.LIZLLL().LJ;
                                            if (interfaceC56318M8k2 != null) {
                                                M74 m744 = c56309M8b.LJLJJLL;
                                                enumC56313M8f2.getErrCode();
                                                interfaceC56318M8k2.LIZIZ(m744, enumC56312M8e2.getErrMsg());
                                            }
                                            C56311M8d.LIZIZ(c56309M8b, EnumC56314M8g.POPUP_ASYNC_EXCEPTION, c56309M8b.LJLJJI.getSceneId(), "asyncResult returns false", null);
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append(c56309M8b.LJLILLLLZI);
                                            LIZ3.append(" failed because asyncResult returns false");
                                            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ3));
                                            c56309M8b.LJLJJLL.getStateWrapper().LIZIZ();
                                        }
                                    }
                                } else {
                                    M74 m745 = c56309M8b.LJLJJLL;
                                    EnumC56313M8f enumC56313M8f3 = EnumC56313M8f.ASYNC_FALSE;
                                    int errCode3 = enumC56313M8f3.getErrCode();
                                    EnumC56312M8e enumC56312M8e3 = EnumC56312M8e.ASYNC_TIMEOUT;
                                    m745.showPopupFailed(errCode3, enumC56312M8e3.getErrMsg());
                                    InterfaceC56318M8k interfaceC56318M8k3 = PopupManager.LIZLLL().LJ;
                                    if (interfaceC56318M8k3 != null) {
                                        M74 m746 = c56309M8b.LJLJJLL;
                                        enumC56313M8f3.getErrCode();
                                        interfaceC56318M8k3.LIZIZ(m746, enumC56312M8e3.getErrMsg());
                                    }
                                    C56311M8d.LIZIZ(c56309M8b, EnumC56314M8g.POPUP_ASYNC_EXCEPTION, c56309M8b.LJLJJI.getSceneId(), "runAsyncTask timeout", null);
                                    c56309M8b.LJLJJLL.getStateWrapper().LIZIZ();
                                }
                            }
                            Iterator<InterfaceC56317M8j> it = PopupManager.LJIIIIZZ.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC56317M8j = it.next();
                                    if (interfaceC56317M8j.LIZJ(c56309M8b.LJLJJLL)) {
                                        break;
                                    }
                                } else {
                                    interfaceC56317M8j = null;
                                    break;
                                }
                            }
                            InterfaceC56317M8j interfaceC56317M8j2 = interfaceC56317M8j;
                            if (interfaceC56317M8j2 != null && interfaceC56317M8j2.LIZ(c56309M8b.LJLJJLL)) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append(c56309M8b.LJLJJLL);
                                LIZ4.append(" is intercepted.");
                                C44384HbQ.LLFZ(X1D.LIZIZ(LIZ4));
                                M74 m747 = c56309M8b.LJLJJLL;
                                EnumC56313M8f enumC56313M8f4 = EnumC56313M8f.INTERCEPT;
                                int errCode4 = enumC56313M8f4.getErrCode();
                                StringBuilder LIZ5 = X1D.LIZ();
                                EnumC56312M8e enumC56312M8e4 = EnumC56312M8e.INTERCEPT;
                                LIZ5.append(enumC56312M8e4.getErrMsg());
                                if (interfaceC56317M8j2 != null) {
                                    str = interfaceC56317M8j2.getClass().getName();
                                } else {
                                    str = null;
                                }
                                LIZ5.append(str);
                                LIZ5.append('.');
                                m747.showPopupFailed(errCode4, X1D.LIZIZ(LIZ5));
                                InterfaceC56318M8k interfaceC56318M8k4 = PopupManager.LIZLLL().LJ;
                                if (interfaceC56318M8k4 != null) {
                                    M74 m748 = c56309M8b.LJLJJLL;
                                    enumC56313M8f4.getErrCode();
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append(enumC56312M8e4.getErrMsg());
                                    if (interfaceC56317M8j2 != null) {
                                        str2 = interfaceC56317M8j2.getClass().getName();
                                    } else {
                                        str2 = null;
                                    }
                                    LIZ6.append(str2);
                                    LIZ6.append('.');
                                    interfaceC56318M8k4.LIZIZ(m748, X1D.LIZIZ(LIZ6));
                                }
                                String sceneId = this.LJLILLLLZI.getSceneId();
                                EnumC56314M8g enumC56314M8g = EnumC56314M8g.POPUP_INTERCEPTOR;
                                if (interfaceC56317M8j2 != null) {
                                    interfaceC56317M8j2.LIZIZ();
                                }
                                C56311M8d.LIZIZ(c56309M8b, enumC56314M8g, sceneId, "Interceptor", null);
                                return;
                            }
                            c56309M8b.LJLJJLL.getClass();
                            c56309M8b.LJLJJLL.getPriority();
                            String sceneId2 = c56309M8b.LJLJJLL.scene.getSceneId();
                            PopupManager.LIZLLL().getClass();
                            o.LJIIIZ(sceneId2, "sceneId");
                            ((Handler) this.LJLJJLL.getValue()).post(new ARunnableS20S0300000_9(this, c56309M8b, c54082LKk, 10));
                            return;
                        }
                        o.LJII(m76, "null cannot be cast to non-null type com.bytedance.poplayer.Avoid");
                        throw null;
                    }
                } else {
                    M74 m749 = c56309M8b.LJLJJLL;
                    EnumC56313M8f enumC56313M8f5 = EnumC56313M8f.STATE_ERROR;
                    int errCode5 = enumC56313M8f5.getErrCode();
                    EnumC56312M8e enumC56312M8e5 = EnumC56312M8e.STATE_ERROR;
                    m749.showPopupFailed(errCode5, enumC56312M8e5.getErrMsg());
                    InterfaceC56318M8k interfaceC56318M8k5 = PopupManager.LIZLLL().LJ;
                    if (interfaceC56318M8k5 != null) {
                        M74 m7410 = c56309M8b.LJLJJLL;
                        enumC56313M8f5.getErrCode();
                        interfaceC56318M8k5.LIZIZ(m7410, enumC56312M8e5.getErrMsg());
                    }
                    String sceneId3 = c56309M8b.LJLJJI.getSceneId();
                    EnumC56314M8g enumC56314M8g2 = EnumC56314M8g.POPUP_STATE_ERROR;
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("Pop State ");
                    LIZ7.append(c56309M8b.LJLJJLL.getState());
                    C56311M8d.LIZIZ(c56309M8b, enumC56314M8g2, sceneId3, X1D.LIZIZ(LIZ7), null);
                }
            }
            if (!c56309M8b.LJLJJI.isSceneActive()) {
                M74 m7411 = c56309M8b.LJLJJLL;
                EnumC56313M8f enumC56313M8f6 = EnumC56313M8f.SCENE_INACTIVE;
                int errCode6 = enumC56313M8f6.getErrCode();
                EnumC56312M8e enumC56312M8e6 = EnumC56312M8e.SCENE_INACTIVE;
                m7411.showPopupFailed(errCode6, enumC56312M8e6.getErrMsg());
                InterfaceC56318M8k interfaceC56318M8k6 = PopupManager.LIZLLL().LJ;
                if (interfaceC56318M8k6 != null) {
                    M74 m7412 = c56309M8b.LJLJJLL;
                    enumC56313M8f6.getErrCode();
                    interfaceC56318M8k6.LIZIZ(m7412, enumC56312M8e6.getErrMsg());
                }
            } else if (!canShow) {
                M74 m7413 = c56309M8b.LJLJJLL;
                EnumC56313M8f enumC56313M8f7 = EnumC56313M8f.CAN_SHOW_FALSE;
                int errCode7 = enumC56313M8f7.getErrCode();
                EnumC56312M8e enumC56312M8e7 = EnumC56312M8e.CAN_SHOW_FALSE;
                m7413.showPopupFailed(errCode7, enumC56312M8e7.getErrMsg());
                InterfaceC56318M8k interfaceC56318M8k7 = PopupManager.LIZLLL().LJ;
                if (interfaceC56318M8k7 != null) {
                    M74 m7414 = c56309M8b.LJLJJLL;
                    enumC56313M8f7.getErrCode();
                    interfaceC56318M8k7.LIZIZ(m7414, enumC56312M8e7.getErrMsg());
                }
            } else {
                c56309M8b.LJLJJLL.getClass();
            }
            LIZJ();
            return;
        }
        M74 m7415 = c56309M8b.LJLJJLL;
        EnumC56313M8f enumC56313M8f8 = EnumC56313M8f.STOP_SWITCH_OPEN;
        int errCode8 = enumC56313M8f8.getErrCode();
        EnumC56312M8e enumC56312M8e8 = EnumC56312M8e.STOP_SWITCH_OPEN;
        m7415.showPopupFailed(errCode8, enumC56312M8e8.getErrMsg());
        InterfaceC56318M8k interfaceC56318M8k8 = PopupManager.LIZLLL().LJ;
        if (interfaceC56318M8k8 == null) {
            return;
        }
        M74 m7416 = c56309M8b.LJLJJLL;
        enumC56313M8f8.getErrCode();
        interfaceC56318M8k8.LIZIZ(m7416, enumC56312M8e8.getErrMsg());
    }

    public final void LJ(C56309M8b c56309M8b, C54082LKk c54082LKk) {
        Object obj;
        M78 stateWrapper = c56309M8b.LJLJJLL.getStateWrapper();
        synchronized (stateWrapper) {
            ((ArrayList) stateWrapper.LIZIZ).add(this);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c56309M8b.LJLILLLLZI);
        LIZ.append(" call showPopLayer.");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
        if (PopupManager.LJIIIZ.get()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c56309M8b.LJLILLLLZI);
            LIZ2.append(" shows failed because PopLayerManager is stopped.");
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
            return;
        }
        PopupManager.LIZLLL().LJII.execute(new ARunnableS45S0100000_9(c56309M8b, 203));
        InterfaceC56318M8k interfaceC56318M8k = PopupManager.LIZLLL().LJ;
        if (interfaceC56318M8k != null) {
            interfaceC56318M8k.LIZJ(c56309M8b.LJLJJLL);
        }
        InterfaceC56321M8n interfaceC56321M8n = c56309M8b.LJLJJLL;
        if (interfaceC56321M8n instanceof M72) {
            M78 stateWrapper2 = interfaceC56321M8n.getStateWrapper();
            stateWrapper2.getClass();
            stateWrapper2.LIZJ(M7A.SHOWED);
            InterfaceC56321M8n interfaceC56321M8n2 = c56309M8b.LJLJJLL;
            o.LJII(interfaceC56321M8n2, "null cannot be cast to non-null type com.bytedance.poplayer.ICustomPopupTask");
            ((M72) interfaceC56321M8n2).LIZLLL(c54082LKk, c56309M8b.LJLJJLL.getStateWrapper());
            String id = c56309M8b.LJLJJLL.getId();
            o.LJIIIZ(id, "id");
            PopupManager.LJFF.add(id);
            return;
        }
        if (!(interfaceC56321M8n instanceof IPopupTask)) {
            return;
        }
        o.LJII(interfaceC56321M8n, "null cannot be cast to non-null type com.bytedance.poplayer.IPopupTask<*>");
        Object showPopup = ((IPopupTask) interfaceC56321M8n).showPopup(c54082LKk);
        if (showPopup == null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(c56309M8b.LJLILLLLZI);
            LIZ3.append(" show failed because showPopLayer() returns null.");
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ3));
            c56309M8b.LJLJJLL.getStateWrapper().LIZIZ();
            LIZJ();
            return;
        }
        Method method = LJLJLJ;
        View view = null;
        if (method != null) {
            M74 m74 = c56309M8b.LJLJJLL;
            Object[] objArr = {showPopup};
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{m74, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3910577685536030097"));
            if (LIZJ.LIZ) {
                obj = LIZJ.LIZIZ;
            } else {
                obj = method.invoke(m74, objArr);
            }
        } else {
            obj = null;
        }
        if (obj instanceof View) {
            view = (View) obj;
        }
        M78 stateWrapper3 = c56309M8b.LJLJJLL.getStateWrapper();
        stateWrapper3.getClass();
        stateWrapper3.LIZJ(M7A.SHOWED);
        String id2 = c56309M8b.LJLJJLL.getId();
        o.LJIIIZ(id2, "id");
        PopupManager.LJFF.add(id2);
        if (view == null) {
            ((Handler) this.LJLJJLL.getValue()).post(new ARunnableS13S0400000_9(c56309M8b, showPopup, this, c54082LKk, 4));
        } else {
            LIZLLL(c56309M8b, view, c54082LKk);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(M7A fromState, M7A toState) {
        String str;
        M74 m74;
        InterfaceC56318M8k interfaceC56318M8k;
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
        if (toState == M7A.DISMISSED) {
            StringBuilder LIZ = X1D.LIZ();
            C56309M8b c56309M8b = this.LJLJL;
            if (c56309M8b != null) {
                str = c56309M8b.LJLILLLLZI;
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(" dismissed");
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
            C56309M8b c56309M8b2 = this.LJLJL;
            if (c56309M8b2 != null) {
                PopupManager.LIZLLL().LJII.execute(new ARunnableS45S0100000_9(c56309M8b2, 202));
            }
            C56309M8b c56309M8b3 = this.LJLJL;
            if (c56309M8b3 != null && (m74 = c56309M8b3.LJLJJLL) != null && (interfaceC56318M8k = PopupManager.LIZLLL().LJ) != null) {
                interfaceC56318M8k.LIZ(m74);
            }
            LIZJ();
        }
        return C76800UCe.LIZ;
    }

    public PopupTaskExecutor(C54082LKk c54082LKk, InterfaceC55643Lsd scene, CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = c54082LKk;
        this.LJLILLLLZI = scene;
        this.LJLJI = copyOnWriteArrayList;
        this.LJLJJL = new AtomicBoolean(true);
        this.LJLJJLL = C221108m2.LIZIZ(C56315M8h.INSTANCE);
    }

    public static void LIZLLL(C56309M8b c56309M8b, final View view, final C54082LKk c54082LKk) {
        final IDLListenerS60S0200000_9 iDLListenerS60S0200000_9 = new IDLListenerS60S0200000_9(view, c56309M8b, 0);
        final IDCListenerS116S0200000_9 iDCListenerS116S0200000_9 = new IDCListenerS116S0200000_9(view, c56309M8b, 0);
        c54082LKk.LIZIZ.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupTaskExecutor$registerObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C54082LKk.this.LIZIZ.getLifecycle().removeObserver(this);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS60S0200000_9);
                view.removeOnAttachStateChangeListener(iDCListenerS116S0200000_9);
            }
        });
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(iDLListenerS60S0200000_9);
        }
        view.addOnAttachStateChangeListener(iDCListenerS116S0200000_9);
    }
}
