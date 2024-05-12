package kotlin.jvm.internal;

import X.AbstractC23570wD;
import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC531926x;
import X.AbstractC65781Prl;
import X.AnonymousClass048;
import X.BDG;
import X.C06460Ne;
import X.C07160Pw;
import X.C07460Ra;
import X.C08350Ul;
import X.C08490Uz;
import X.C0DR;
import X.C0ME;
import X.C0Q1;
import X.C0RI;
import X.C0UY;
import X.C0VG;
import X.C0VH;
import X.C0WN;
import X.C10370av;
import X.C12000dY;
import X.C14360hM;
import X.C14760i0;
import X.C14780i2;
import X.C15010iP;
import X.C16120kC;
import X.C16300kU;
import X.C18480o0;
import X.C18510o3;
import X.C18810oX;
import X.C18830oZ;
import X.C18890of;
import X.C18900og;
import X.C1DJ;
import X.C1HK;
import X.C1HU;
import X.C1IC;
import X.C1JI;
import X.C1KE;
import X.C1NC;
import X.C1OH;
import X.C1OJ;
import X.C1QW;
import X.C1QX;
import X.C1YW;
import X.C20G;
import X.C21180sM;
import X.C23450w1;
import X.C24860yI;
import X.C279917z;
import X.C29306Beo;
import X.C29321Dc;
import X.C2E8;
import X.C30868C9o;
import X.C31824CeK;
import X.C31841Mu;
import X.C33491Td;
import X.C33711Tz;
import X.C33811Uj;
import X.C34K;
import X.C37;
import X.C37951eJ;
import X.C40741io;
import X.C45211q1;
import X.C45804HyK;
import X.C47261Igj;
import X.C48211ur;
import X.C50941zG;
import X.C50961zI;
import X.C51071zT;
import X.C522523h;
import X.C522823k;
import X.C522923l;
import X.C523123n;
import X.C523223o;
import X.C523323p;
import X.C523523r;
import X.C523723t;
import X.C55072Ed;
import X.C55082Ee;
import X.C55572Gb;
import X.C56K;
import X.C68322mC;
import X.C72085SQv;
import X.C76800UCe;
import X.C78886Uxe;
import X.C78923UyF;
import X.C78983UzD;
import X.C7MY;
import X.CUC;
import X.CVC;
import X.EnumC18670oJ;
import X.EnumC21140sI;
import X.EnumC21150sJ;
import X.InterfaceC11750d9;
import X.InterfaceC13090fJ;
import X.InterfaceC13170fR;
import X.InterfaceC14750hz;
import X.InterfaceC14950iJ;
import X.InterfaceC22350uF;
import X.InterfaceC24520xk;
import X.InterfaceC24580xq;
import X.InterfaceC24760y8;
import X.InterfaceC266512v;
import X.InterfaceC30442Bx8;
import X.InterfaceC32701Qc;
import X.InterfaceC33691Tx;
import X.InterfaceC35811ar;
import X.InterfaceC44861pS;
import X.InterfaceC70422pa;
import X.InterfaceC72996Skq;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.MBB;
import X.OSZ;
import X.X1D;
import X.XKW;
import X.XKX;
import Y.IDObserverS9S0101000;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.WrappedComposition;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.dataChannel.BGMDismissVolumeBarEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;
import o3.h0;
import webcast.data.MusicSong;

/* loaded from: classes.dex */
public class IDqS28S0300000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            default:
                return null;
        }
    }

    public static final void invoke$lambda$1$1(InterfaceC22350uF callback) {
        o.LJIIIZ(callback, "$callback");
        callback.onResult(null);
    }

    public final void invoke$0(Void r4) {
        CancellationSignal cancellationSignal = (CancellationSignal) this.l1;
        if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
            Executor executor = (Executor) this.l2;
            final InterfaceC22350uF interfaceC22350uF = (InterfaceC22350uF) this.l0;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    IDqS28S0300000.invoke$lambda$1$1(InterfaceC22350uF.this);
                }
            });
        }
    }

    public final void invoke$3(Throwable th) {
        XKW xkw = (XKW) this.l0;
        MBB mbb = MBB.INSTANCE;
        if (xkw.isDispatchNeeded(mbb)) {
            XKW xkw2 = (XKW) this.l0;
            final Lifecycle lifecycle = (Lifecycle) this.l2;
            final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) this.l1;
            xkw2.dispatch(mbb, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1__run$___twin___() {
                    Lifecycle.this.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                }

                public static void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1) {
                    boolean LIZ;
                    try {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1.androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        ((Lifecycle) this.l2).removeObserver((WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) this.l1);
    }

    public static final Object invoke$0(IDqS28S0300000 iDqS28S0300000, Object obj) {
        AnonymousClass048 it = (AnonymousClass048) obj;
        o.LJIIIZ(it, "it");
        if (!((WrappedComposition) iDqS28S0300000.l0).LJLJI) {
            Lifecycle lifecycle = it.LIZ.getLifecycle();
            o.LJIIIIZZ(lifecycle, "it.lifecycleOwner.lifecycle");
            final WrappedComposition wrappedComposition = (WrappedComposition) iDqS28S0300000.l0;
            wrappedComposition.LJLJJL = (InterfaceC88471Ynr) iDqS28S0300000.l1;
            if (wrappedComposition.LJLJJI == null) {
                wrappedComposition.LJLJJI = lifecycle;
                final WrappedComposition wrappedComposition2 = (WrappedComposition) iDqS28S0300000.l2;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (WrappedComposition.this.LIZIZ() && event == Lifecycle.Event.ON_CREATE) {
                            return;
                        }
                        wrappedComposition2.onStateChanged(source, event);
                    }
                });
            } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                WrappedComposition wrappedComposition3 = (WrappedComposition) iDqS28S0300000.l0;
                wrappedComposition3.LJLILLLLZI.LJIILJJIL(C1DJ.LJFF(new IDqS189S0200000(wrappedComposition3, (WrappedComposition) iDqS28S0300000.l1, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) 1), 622464890, true));
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS28S0300000 iDqS28S0300000, Object obj) {
        iDqS28S0300000.invoke$0((Void) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS28S0300000 iDqS28S0300000, Object obj) {
        InterfaceC32701Qc graphicsLayer = (InterfaceC32701Qc) obj;
        o.LJIIIZ(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(((Number) ((InterfaceC24760y8) iDqS28S0300000.l0).getValue()).floatValue());
        graphicsLayer.LJIILJJIL(((Number) ((InterfaceC24760y8) iDqS28S0300000.l1).getValue()).floatValue());
        graphicsLayer.LJIILLIIL(((Number) ((InterfaceC24760y8) iDqS28S0300000.l1).getValue()).floatValue());
        graphicsLayer.LJJJJLI(((C12000dY) ((InterfaceC24760y8) iDqS28S0300000.l2).getValue()).LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS28S0300000 iDqS28S0300000, Object obj) {
        Boolean bool;
        CVC cvc = (CVC) obj;
        CUC cuc = (CUC) iDqS28S0300000.l0;
        Boolean bool2 = null;
        if (cuc != null) {
            bool = Boolean.valueOf(cuc.isShown());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (!InterfaceC30442Bx8.LJJIL.LIZJ().booleanValue()) {
                ((C0RI) iDqS28S0300000.l1).LIZIZ.LJJLL(false);
            } else {
                InterfaceC266512v interfaceC266512v = (InterfaceC266512v) iDqS28S0300000.l2;
                if (interfaceC266512v != null) {
                    bool2 = Boolean.valueOf(interfaceC266512v.LLIIIJ());
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                    ((C0RI) iDqS28S0300000.l1).LIZIZ.LJJLL(false);
                } else if (cvc != null) {
                    ((C0RI) iDqS28S0300000.l1).LIZIZ.LJJLJLI(cvc);
                    C0RI c0ri = (C0RI) iDqS28S0300000.l1;
                    if (!c0ri.LIZJ) {
                        c0ri.LIZJ = true;
                        CUC cuc2 = (CUC) iDqS28S0300000.l0;
                        if (cuc2 != null) {
                            cuc2.setTipsView(c0ri.LIZIZ);
                        }
                    }
                } else {
                    ((C0RI) iDqS28S0300000.l1).LIZIZ.LJJLL(false);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS28S0300000 iDqS28S0300000, Object obj) {
        C37 it = (C37) obj;
        o.LJIIIZ(it, "it");
        int i = C07460Ra.LIZ[it.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((Handler) ((C1KE) iDqS28S0300000.l0).LIZIZ.getValue()).postDelayed(new Runnable() { // from class: X.0RZ
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                if (DataChannelGlobal.LJLJJI.mv0(BroadcastSceneGlobalChannel.class) == C37.BROADCAST) {
                                    C40641ie c40641ie = C40641ie.LJLIL;
                                    EnumC08760Wa enumC08760Wa = EnumC08760Wa.CO_HOST_INSERT;
                                    c40641ie.getClass();
                                    C40641ie.LJI(enumC08760Wa);
                                    C40641ie.LJI(EnumC08760Wa.MULTI_GUEST_INSERT);
                                }
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    }, 2000L);
                }
            } else {
                C1KE c1ke = (C1KE) iDqS28S0300000.l0;
                DataChannel dataChannel = (DataChannel) iDqS28S0300000.l1;
                Fragment fragment = (Fragment) iDqS28S0300000.l2;
                c1ke.getClass();
                if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isExperiment()) {
                    C72085SQv c72085SQv = c1ke.LIZ;
                    C37 c37 = C37.MULTI_GUEST;
                    c72085SQv.getClass();
                    C72085SQv.LIZJ(dataChannel, fragment, c37);
                }
            }
        } else {
            C1KE c1ke2 = (C1KE) iDqS28S0300000.l0;
            DataChannel dataChannel2 = (DataChannel) iDqS28S0300000.l1;
            Fragment fragment2 = (Fragment) iDqS28S0300000.l2;
            c1ke2.getClass();
            if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isExperiment()) {
                C72085SQv c72085SQv2 = c1ke2.LIZ;
                C37 c372 = C37.CO_HOST;
                c72085SQv2.getClass();
                C72085SQv.LIZJ(dataChannel2, fragment2, c372);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS28S0300000 iDqS28S0300000, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) iDqS28S0300000.l0;
        final Map map = (Map) iDqS28S0300000.l1;
        final C1OH c1oh = (C1OH) iDqS28S0300000.l2;
        return new InterfaceC24580xq() { // from class: X.1Lw
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                Trace.beginSection("clickable:DisposableEffect");
                try {
                    C1OJ c1oj = (C1OJ) InterfaceC35811ar.this.getValue();
                    if (c1oj != null) {
                        c1oh.LIZ(new C1OI(c1oj));
                        InterfaceC35811ar.this.setValue(null);
                    }
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        c1oh.LIZ(new C1OI((C1OJ) it.next()));
                    }
                    map.clear();
                } finally {
                    Trace.endSection();
                }
            }
        };
    }

    public static final Object invoke$14(IDqS28S0300000 iDqS28S0300000, Object obj) {
        C0Q1 animateDecay = (C0Q1) obj;
        o.LJIIIZ(animateDecay, "$this$animateDecay");
        float floatValue = ((Number) animateDecay.LIZ()).floatValue() - ((C56K) iDqS28S0300000.l0).element;
        float LIZ = ((C0UY) iDqS28S0300000.l1).LIZ(floatValue);
        ((C56K) iDqS28S0300000.l0).element = ((Number) animateDecay.LIZ()).floatValue();
        ((C56K) iDqS28S0300000.l2).element = ((Number) animateDecay.LIZ.LIZIZ().invoke(animateDecay.LJFF)).floatValue();
        if (Math.abs(floatValue - LIZ) > 0.5f) {
            animateDecay.LJII.setValue(Boolean.FALSE);
            animateDecay.LIZLLL.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS28S0300000 iDqS28S0300000, Object obj) {
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        long j = ((C50941zG) iDqS28S0300000.l0).LJLILLLLZI.invoke((InterfaceC44861pS) iDqS28S0300000.l1).LIZ;
        if (((C50941zG) iDqS28S0300000.l0).LJLJI) {
            AbstractC274515x.LJII(layout, (AbstractC39201gK) iDqS28S0300000.l2, (int) (j >> 32), C23450w1.LIZJ(j));
        } else {
            AbstractC274515x.LJIIIZ(layout, (AbstractC39201gK) iDqS28S0300000.l2, (int) (j >> 32), C23450w1.LIZJ(j), null, 12);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS28S0300000 iDqS28S0300000, Object obj) {
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        C50961zI c50961zI = (C50961zI) iDqS28S0300000.l0;
        if (c50961zI.LJLJJLL) {
            AbstractC274515x.LJI(layout, (AbstractC39201gK) iDqS28S0300000.l1, ((InterfaceC44861pS) iDqS28S0300000.l2).LJJIJ(c50961zI.LJLILLLLZI), ((InterfaceC44861pS) iDqS28S0300000.l2).LJJIJ(((C50961zI) iDqS28S0300000.l0).LJLJI));
        } else {
            AbstractC274515x.LIZJ((AbstractC39201gK) iDqS28S0300000.l1, ((InterfaceC44861pS) iDqS28S0300000.l2).LJJIJ(c50961zI.LJLILLLLZI), ((InterfaceC44861pS) iDqS28S0300000.l2).LJJIJ(((C50961zI) iDqS28S0300000.l0).LJLJI), 0.0f);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS28S0300000 iDqS28S0300000, Object layout) {
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK abstractC39201gK = (AbstractC39201gK) iDqS28S0300000.l0;
        InterfaceC44861pS interfaceC44861pS = (InterfaceC44861pS) iDqS28S0300000.l1;
        AbstractC274515x.LIZJ(abstractC39201gK, interfaceC44861pS.LJJIJ(((C51071zT) iDqS28S0300000.l2).LJLILLLLZI.LIZJ(interfaceC44861pS.getLayoutDirection())), ((InterfaceC44861pS) iDqS28S0300000.l1).LJJIJ(((C51071zT) iDqS28S0300000.l2).LJLILLLLZI.LIZLLL()), 0.0f);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS28S0300000 iDqS28S0300000, Object obj) {
        boolean z;
        int intValue = ((Number) obj).intValue();
        if (intValue >= 0 && intValue < ((InterfaceC13090fJ) iDqS28S0300000.l0).getItemCount()) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC13090fJ interfaceC13090fJ = (InterfaceC13090fJ) iDqS28S0300000.l0;
        if (z) {
            XKX.LIZLLL((InterfaceC70422pa) iDqS28S0300000.l1, null, null, new C2E8((InterfaceC13170fR) iDqS28S0300000.l2, intValue, null), 3);
            return Boolean.TRUE;
        }
        StringBuilder LJ = C7MY.LJ("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
        LJ.append(interfaceC13090fJ.getItemCount());
        LJ.append(')');
        String LIZIZ = X1D.LIZIZ(LJ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final Object invoke$19(IDqS28S0300000 iDqS28S0300000, Object it) {
        o.LJIIIZ(it, "it");
        DataChannel dataChannel = ((C33491Td) iDqS28S0300000.l0).LJLJI;
        if (dataChannel != null) {
            dataChannel.pv0(BGMDismissVolumeBarEvent.class);
        }
        MusicSong musicSong = (MusicSong) iDqS28S0300000.l1;
        if (!musicSong.isFavourite) {
            C33491Td c33491Td = (C33491Td) iDqS28S0300000.l0;
            C29306Beo.LJJIIJZLJL(c33491Td.LJLJJI, null, new C55072Ed(c33491Td, musicSong, null), 3);
            ((LiveIconView) ((View) iDqS28S0300000.l2).findViewById(R.id.d5i)).setIconAttr(R.attr.aq4);
            C33491Td c33491Td2 = (C33491Td) iDqS28S0300000.l0;
            C14360hM.LIZIZ(c33491Td2.LJLJI, (MusicSong) iDqS28S0300000.l1, "favorite", c33491Td2.LJLJJLL, c33491Td2.LJLJJL);
        } else {
            C33491Td c33491Td3 = (C33491Td) iDqS28S0300000.l0;
            C29306Beo.LJJIIJZLJL(c33491Td3.LJLJJI, null, new C55082Ee(c33491Td3, musicSong, null), 3);
            ((LiveIconView) ((View) iDqS28S0300000.l2).findViewById(R.id.d5i)).setIconAttr(R.attr.aq3);
            C33491Td c33491Td4 = (C33491Td) iDqS28S0300000.l0;
            C14360hM.LIZIZ(c33491Td4.LJLJI, (MusicSong) iDqS28S0300000.l1, "cancel_favorite", c33491Td4.LJLJJLL, c33491Td4.LJLJJL);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(IDqS28S0300000 iDqS28S0300000, Object obj) {
        iDqS28S0300000.invoke$3((Throwable) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS28S0300000 iDqS28S0300000, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        ((OnBackPressedDispatcher) iDqS28S0300000.l0).LIZ((LifecycleOwner) iDqS28S0300000.l1, (C33811Uj) iDqS28S0300000.l2);
        final C33811Uj c33811Uj = (C33811Uj) iDqS28S0300000.l2;
        return new InterfaceC24580xq() { // from class: X.1Uk
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                LIZIZ();
            }
        };
    }

    public static final Object invoke$21(IDqS28S0300000 iDqS28S0300000, Object obj) {
        C0VG c0vg;
        C0VG c0vg2;
        C18830oZ c18830oZ;
        C18830oZ c18830oZ2;
        C0VG c0vg3;
        C0VG c0vg4;
        C18830oZ c18830oZ3;
        C18830oZ c18830oZ4;
        C18890of c18890of;
        C18890of c18890of2;
        C18890of c18890of3;
        C1YW commandExecutionContext = (C1YW) obj;
        o.LJIIIZ(commandExecutionContext, "$this$commandExecutionContext");
        switch (C18480o0.LIZ[((EnumC18670oJ) iDqS28S0300000.l0).ordinal()]) {
            case 1:
                ((C18510o3) iDqS28S0300000.l1).LIZIZ.LIZLLL(false);
                break;
            case 2:
                ((C18510o3) iDqS28S0300000.l1).LIZIZ.LJIIJJI();
                break;
            case 3:
                ((C18510o3) iDqS28S0300000.l1).LIZIZ.LJFF();
                break;
            case 4:
                C522523h or = C522523h.LJLIL;
                o.LJIIIZ(or, "or");
                commandExecutionContext.LJ.LIZ = null;
                if (commandExecutionContext.LJI.LJLIL.length() > 0) {
                    if (C08350Ul.LIZIZ(commandExecutionContext.LJFF)) {
                        or.invoke(commandExecutionContext);
                        break;
                    } else if (commandExecutionContext.LJ()) {
                        int LJ = C08350Ul.LJ(commandExecutionContext.LJFF);
                        commandExecutionContext.LJIL(LJ, LJ);
                        break;
                    } else {
                        int LIZLLL = C08350Ul.LIZLLL(commandExecutionContext.LJFF);
                        commandExecutionContext.LJIL(LIZLLL, LIZLLL);
                        break;
                    }
                }
                break;
            case 5:
                C522823k or2 = C522823k.LJLIL;
                o.LJIIIZ(or2, "or");
                commandExecutionContext.LJ.LIZ = null;
                if (commandExecutionContext.LJI.LJLIL.length() > 0) {
                    if (C08350Ul.LIZIZ(commandExecutionContext.LJFF)) {
                        or2.invoke(commandExecutionContext);
                        break;
                    } else if (commandExecutionContext.LJ()) {
                        int LIZLLL2 = C08350Ul.LIZLLL(commandExecutionContext.LJFF);
                        commandExecutionContext.LJIL(LIZLLL2, LIZLLL2);
                        break;
                    } else {
                        int LJ2 = C08350Ul.LJ(commandExecutionContext.LJFF);
                        commandExecutionContext.LJIL(LJ2, LJ2);
                        break;
                    }
                }
                break;
            case 6:
                commandExecutionContext.LJII();
                break;
            case 7:
                commandExecutionContext.LJIILL();
                break;
            case 8:
                commandExecutionContext.LJIIL();
                break;
            case 9:
                commandExecutionContext.LJIIIZ();
                break;
            case 10:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c0vg = commandExecutionContext.LIZJ) != null) {
                    int LJFF = commandExecutionContext.LJFF(c0vg, -1);
                    commandExecutionContext.LJIL(LJFF, LJFF);
                    break;
                }
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c0vg2 = commandExecutionContext.LIZJ) != null) {
                    int LJFF2 = commandExecutionContext.LJFF(c0vg2, 1);
                    commandExecutionContext.LJIL(LJFF2, LJFF2);
                    break;
                }
                break;
            case 12:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c18830oZ = commandExecutionContext.LJIIIIZZ) != null) {
                    int LJJI = commandExecutionContext.LJJI(c18830oZ, -1);
                    commandExecutionContext.LJIL(LJJI, LJJI);
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c18830oZ2 = commandExecutionContext.LJIIIIZZ) != null) {
                    int LJJI2 = commandExecutionContext.LJJI(c18830oZ2, 1);
                    commandExecutionContext.LJIL(LJJI2, LJJI2);
                    break;
                }
                break;
            case 14:
                commandExecutionContext.LJIJJ();
                break;
            case 15:
                commandExecutionContext.LJIIZILJ();
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                commandExecutionContext.LJIJ();
                break;
            case 17:
                commandExecutionContext.LJIJI();
                break;
            case 18:
                commandExecutionContext.LJ.LIZ = null;
                if (commandExecutionContext.LJI.LJLIL.length() > 0) {
                    commandExecutionContext.LJIL(0, 0);
                    break;
                }
                break;
            case 19:
                commandExecutionContext.LJIILLIIL();
                break;
            case 20:
                List<InterfaceC14750hz> LJJ = commandExecutionContext.LJJ(C522923l.LJLIL);
                if (LJJ != null) {
                    ((C18510o3) iDqS28S0300000.l1).LIZ(LJJ);
                    break;
                }
                break;
            case 21:
                List<InterfaceC14750hz> LJJ2 = commandExecutionContext.LJJ(C523123n.LJLIL);
                if (LJJ2 != null) {
                    ((C18510o3) iDqS28S0300000.l1).LIZ(LJJ2);
                    break;
                }
                break;
            case 22:
                List<InterfaceC14750hz> LJJ3 = commandExecutionContext.LJJ(C523223o.LJLIL);
                if (LJJ3 != null) {
                    ((C18510o3) iDqS28S0300000.l1).LIZ(LJJ3);
                    break;
                }
                break;
            case 23:
                List<InterfaceC14750hz> LJJ4 = commandExecutionContext.LJJ(C523323p.LJLIL);
                if (LJJ4 != null) {
                    ((C18510o3) iDqS28S0300000.l1).LIZ(LJJ4);
                    break;
                }
                break;
            case 24:
                List<InterfaceC14750hz> LJJ5 = commandExecutionContext.LJJ(C523523r.LJLIL);
                if (LJJ5 != null) {
                    ((C18510o3) iDqS28S0300000.l1).LIZ(LJJ5);
                    break;
                }
                break;
            case 25:
                List<InterfaceC14750hz> LJJ6 = commandExecutionContext.LJJ(C523723t.LJLIL);
                if (LJJ6 != null) {
                    ((C18510o3) iDqS28S0300000.l1).LIZ(LJJ6);
                    break;
                }
                break;
            case 26:
                C18510o3 c18510o3 = (C18510o3) iDqS28S0300000.l1;
                if (!c18510o3.LJ) {
                    c18510o3.LIZ(C47261Igj.LJJIJ(new C33711Tz("\n", 1)));
                    break;
                } else {
                    ((C34K) iDqS28S0300000.l2).element = false;
                    break;
                }
            case 27:
                C18510o3 c18510o32 = (C18510o3) iDqS28S0300000.l1;
                if (!c18510o32.LJ) {
                    c18510o32.LIZ(C47261Igj.LJJIJ(new C33711Tz("\t", 1)));
                    break;
                } else {
                    ((C34K) iDqS28S0300000.l2).element = false;
                    break;
                }
            case 28:
                commandExecutionContext.LJ.LIZ = null;
                if (commandExecutionContext.LJI.LJLIL.length() > 0) {
                    commandExecutionContext.LJIL(0, commandExecutionContext.LJI.LJLIL.length());
                    break;
                }
                break;
            case 29:
                commandExecutionContext.LJI();
                commandExecutionContext.LJIJJLI();
                break;
            case 30:
                commandExecutionContext.LJIILJJIL();
                commandExecutionContext.LJIJJLI();
                break;
            case 31:
                commandExecutionContext.LJII();
                commandExecutionContext.LJIJJLI();
                break;
            case 32:
                commandExecutionContext.LJIILL();
                commandExecutionContext.LJIJJLI();
                break;
            case 33:
                commandExecutionContext.LJIIL();
                commandExecutionContext.LJIJJLI();
                break;
            case 34:
                commandExecutionContext.LJIIIZ();
                commandExecutionContext.LJIJJLI();
                break;
            case 35:
                commandExecutionContext.LJIJJ();
                commandExecutionContext.LJIJJLI();
                break;
            case 36:
                commandExecutionContext.LJIIZILJ();
                commandExecutionContext.LJIJJLI();
                break;
            case 37:
                commandExecutionContext.LJIJ();
                commandExecutionContext.LJIJJLI();
                break;
            case 38:
                commandExecutionContext.LJIJI();
                commandExecutionContext.LJIJJLI();
                break;
            case 39:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c0vg3 = commandExecutionContext.LIZJ) != null) {
                    int LJFF3 = commandExecutionContext.LJFF(c0vg3, -1);
                    commandExecutionContext.LJIL(LJFF3, LJFF3);
                }
                commandExecutionContext.LJIJJLI();
                break;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c0vg4 = commandExecutionContext.LIZJ) != null) {
                    int LJFF4 = commandExecutionContext.LJFF(c0vg4, 1);
                    commandExecutionContext.LJIL(LJFF4, LJFF4);
                }
                commandExecutionContext.LJIJJLI();
                break;
            case 41:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c18830oZ3 = commandExecutionContext.LJIIIIZZ) != null) {
                    int LJJI3 = commandExecutionContext.LJJI(c18830oZ3, -1);
                    commandExecutionContext.LJIL(LJJI3, LJJI3);
                }
                commandExecutionContext.LJIJJLI();
                break;
            case 42:
                if (commandExecutionContext.LJI.LJLIL.length() > 0 && (c18830oZ4 = commandExecutionContext.LJIIIIZZ) != null) {
                    int LJJI4 = commandExecutionContext.LJJI(c18830oZ4, 1);
                    commandExecutionContext.LJIL(LJJI4, LJJI4);
                }
                commandExecutionContext.LJIJJLI();
                break;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                commandExecutionContext.LJ.LIZ = null;
                if (commandExecutionContext.LJI.LJLIL.length() > 0) {
                    commandExecutionContext.LJIL(0, 0);
                }
                commandExecutionContext.LJIJJLI();
                break;
            case 44:
                commandExecutionContext.LJIILLIIL();
                commandExecutionContext.LJIJJLI();
                break;
            case 45:
                commandExecutionContext.LJ.LIZ = null;
                if (commandExecutionContext.LJI.LJLIL.length() > 0) {
                    int LIZJ = C08350Ul.LIZJ(commandExecutionContext.LJFF);
                    commandExecutionContext.LJIL(LIZJ, LIZJ);
                    break;
                }
                break;
            case 46:
                C18900og c18900og = ((C18510o3) iDqS28S0300000.l1).LJII;
                if (c18900og != null) {
                    c18900og.LIZ(C15010iP.LIZ(commandExecutionContext.LJII, commandExecutionContext.LJI, commandExecutionContext.LJFF, 4));
                }
                C18900og c18900og2 = ((C18510o3) iDqS28S0300000.l1).LJII;
                if (c18900og2 != null && (c18890of = c18900og2.LIZIZ) != null && (c18890of2 = c18890of.LIZ) != null) {
                    c18900og2.LIZIZ = c18890of2;
                    c18900og2.LIZLLL -= c18890of.LIZIZ.LIZ.LJLIL.length();
                    c18900og2.LIZJ = new C18890of(c18900og2.LIZJ, c18890of.LIZIZ);
                    C15010iP c15010iP = c18890of2.LIZIZ;
                    if (c15010iP != null) {
                        ((C18510o3) iDqS28S0300000.l1).LJIIIZ.invoke(c15010iP);
                        break;
                    }
                }
                break;
            case 47:
                C18900og c18900og3 = ((C18510o3) iDqS28S0300000.l1).LJII;
                if (c18900og3 != null && (c18890of3 = c18900og3.LIZJ) != null) {
                    c18900og3.LIZJ = c18890of3.LIZ;
                    c18900og3.LIZIZ = new C18890of(c18900og3.LIZIZ, c18890of3.LIZIZ);
                    c18900og3.LIZLLL = c18890of3.LIZIZ.LIZ.LJLIL.length() + c18900og3.LIZLLL;
                    C15010iP c15010iP2 = c18890of3.LIZIZ;
                    if (c15010iP2 != null) {
                        ((C18510o3) iDqS28S0300000.l1).LJIIIZ.invoke(c15010iP2);
                        break;
                    }
                }
                break;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(IDqS28S0300000 iDqS28S0300000, Object obj) {
        C15010iP newTextFieldValueState = (C15010iP) obj;
        o.LJIIIZ(newTextFieldValueState, "newTextFieldValueState");
        ((InterfaceC35811ar) iDqS28S0300000.l1).setValue(newTextFieldValueState);
        boolean z = !o.LJ(((InterfaceC35811ar) iDqS28S0300000.l2).getValue(), newTextFieldValueState.LIZ.LJLIL);
        ((InterfaceC35811ar) iDqS28S0300000.l2).setValue(newTextFieldValueState.LIZ.LJLIL);
        if (z) {
            ((InterfaceC88472Yns) iDqS28S0300000.l0).invoke(newTextFieldValueState.LIZ.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(IDqS28S0300000 iDqS28S0300000, Object obj) {
        int LIZIZ;
        int LIZIZ2;
        C1QX LIZ;
        InterfaceC33691Tx drawBehind = (InterfaceC33691Tx) obj;
        o.LJIIIZ(drawBehind, "$this$drawBehind");
        C18830oZ LIZJ = ((C18810oX) iDqS28S0300000.l0).LIZJ();
        if (LIZJ != null) {
            C15010iP value = (C15010iP) iDqS28S0300000.l1;
            InterfaceC14950iJ offsetMapping = (InterfaceC14950iJ) iDqS28S0300000.l2;
            C18810oX c18810oX = (C18810oX) iDqS28S0300000.l0;
            InterfaceC11750d9 canvas = drawBehind.LJJIII().LIZ();
            C0VG textLayoutResult = LIZJ.LIZ;
            C1QW selectionPaint = c18810oX.LJIJI;
            o.LJIIIZ(canvas, "canvas");
            o.LJIIIZ(value, "value");
            o.LJIIIZ(offsetMapping, "offsetMapping");
            o.LJIIIZ(textLayoutResult, "textLayoutResult");
            o.LJIIIZ(selectionPaint, "selectionPaint");
            if (!C08350Ul.LIZIZ(value.LIZIZ) && (LIZIZ = offsetMapping.LIZIZ(C08350Ul.LJ(value.LIZIZ))) != (LIZIZ2 = offsetMapping.LIZIZ(C08350Ul.LIZLLL(value.LIZIZ)))) {
                C08490Uz c08490Uz = textLayoutResult.LIZIZ;
                c08490Uz.getClass();
                if (LIZIZ >= 0 && LIZIZ <= LIZIZ2 && LIZIZ2 <= c08490Uz.LIZ.LIZ.LJLIL.length()) {
                    if (LIZIZ == LIZIZ2) {
                        LIZ = C1JI.LIZ();
                    } else {
                        LIZ = C1JI.LIZ();
                        int size = ((ArrayList) c08490Uz.LJII).size();
                        for (int LJIILJJIL = C45804HyK.LJIILJJIL(LIZIZ, c08490Uz.LJII); LJIILJJIL < size; LJIILJJIL++) {
                            C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
                            int i = c1nc.LJLILLLLZI;
                            if (i >= LIZIZ2) {
                                break;
                            }
                            if (i != c1nc.LJLJI) {
                                C1QX LJIIZILJ = c1nc.LJLIL.LJIIZILJ(c1nc.M(LIZIZ), c1nc.M(LIZIZ2));
                                o.LJIIIZ(LJIIZILJ, "<this>");
                                LJIIZILJ.LJIILJJIL(C78923UyF.LIZ(0.0f, c1nc.LJLJJLL));
                                LIZ.LJIIJJI(LJIIZILJ, C10370av.LIZIZ);
                            }
                        }
                    }
                    canvas.LJIILJJIL(LIZ, selectionPaint);
                } else {
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("Start(", LIZIZ, ") or End(", LIZIZ2, ") is out of range [0..");
                    LIZJ2.append(c08490Uz.LIZ.LIZ.LJLIL.length());
                    LIZJ2.append("), or start > end!");
                    String LIZIZ3 = X1D.LIZIZ(LIZJ2);
                    LIZIZ3.toString();
                    throw new IllegalArgumentException(LIZIZ3);
                }
            }
            C0VH.LIZ(canvas, textLayoutResult);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(IDqS28S0300000 iDqS28S0300000, Object obj) {
        List<? extends InterfaceC14750hz> it = (List) obj;
        o.LJIIIZ(it, "it");
        C14780i2 c14780i2 = (C14780i2) iDqS28S0300000.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDqS28S0300000.l1;
        C14760i0 c14760i0 = (C14760i0) ((C68322mC) iDqS28S0300000.l2).element;
        C15010iP LIZ = c14780i2.LIZ(it);
        if (c14760i0 != null && o.LJ(c14760i0.LIZ.LIZIZ.get(), c14760i0)) {
            c14760i0.LIZIZ.LIZJ(null, LIZ);
        }
        interfaceC88472Yns.invoke(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(IDqS28S0300000 iDqS28S0300000, Object obj) {
        long j;
        EnumC21140sI enumC21140sI = (EnumC21140sI) ((OSZ) iDqS28S0300000.l0).getSecond();
        C279917z c279917z = (C279917z) iDqS28S0300000.l1;
        if (c279917z != null) {
            j = c279917z.LIZ;
        } else {
            j = -1;
        }
        C21180sM.LJ(enumC21140sI, j, EnumC21150sJ.QUEUE);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$26(IDqS28S0300000 iDqS28S0300000, Object obj) {
        final C45211q1 c45211q1;
        C0DR owner = (C0DR) obj;
        o.LJIIIZ(owner, "owner");
        if ((owner instanceof C45211q1) && (c45211q1 = (C45211q1) owner) != null) {
            AbstractC531926x view = (AbstractC531926x) iDqS28S0300000.l0;
            final C29321Dc layoutNode = (C29321Dc) iDqS28S0300000.l1;
            o.LJIIIZ(view, "view");
            o.LJIIIZ(layoutNode, "layoutNode");
            c45211q1.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
            c45211q1.getAndroidViewsHandler$ui_release().addView(view);
            c45211q1.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
            C16300kU.LJIJ(view, 1);
            h0.LJIJI(view, new C16120kC() { // from class: X.19z
                @Override // X.C16120kC
                public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                    o.LJIIIZ(host, "host");
                    o.LJIIIZ(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    C1DT LJIILLIIL = C1E4.LJIILLIIL(C29321Dc.this);
                    o.LJI(LJIILLIIL);
                    C07210Qb LJI = new C07210Qb(LJIILLIIL, false, C78840Uwu.LJJIJ(LJIILLIIL)).LJI();
                    o.LJI(LJI);
                    int i = LJI.LJI;
                    if (i == c45211q1.getSemanticsOwner().LIZ().LJI) {
                        i = -1;
                    }
                    C45211q1 c45211q12 = c45211q1;
                    info.LIZIZ = i;
                    info.LIZ.setParent(c45211q12, i);
                }
            });
        }
        T t = ((C68322mC) iDqS28S0300000.l2).element;
        if (t != 0) {
            ((AbstractC531926x) iDqS28S0300000.l0).setView$ui_release((View) t);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(IDqS28S0300000 iDqS28S0300000, Object obj) {
        ((C37951eJ) iDqS28S0300000.l0).LJLIL.remove((SoundEffect) iDqS28S0300000.l1);
        ((InterfaceC88472Yns) iDqS28S0300000.l2).invoke(-2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(IDqS28S0300000 iDqS28S0300000, Object obj) {
        InterfaceC72996Skq download = (InterfaceC72996Skq) obj;
        o.LJIIIZ(download, "$this$download");
        download.LIZ(new IDqS28S0300000((C37951eJ) iDqS28S0300000.l0, (C37951eJ) iDqS28S0300000.l1, (SoundEffect) iDqS28S0300000.l2, (InterfaceC88472Yns<? super Integer, C76800UCe>) 29));
        download.LIZIZ(new IDqS416S0100000((InterfaceC88472Yns) iDqS28S0300000.l2, 360));
        download.LIZLLL(new IDqS28S0300000((C37951eJ) iDqS28S0300000.l0, (C37951eJ) iDqS28S0300000.l1, (SoundEffect) iDqS28S0300000.l2, (InterfaceC88472Yns<? super Integer, C76800UCe>) 27));
        download.LIZJ(new IDqS40S0300000((C37951eJ) iDqS28S0300000.l0, (C37951eJ) iDqS28S0300000.l1, (SoundEffect) iDqS28S0300000.l2, (InterfaceC88472Yns<? super Integer, C76800UCe>) 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(IDqS28S0300000 iDqS28S0300000, Object obj) {
        ((C37951eJ) iDqS28S0300000.l0).LJLIL.add((SoundEffect) iDqS28S0300000.l1);
        ((InterfaceC88472Yns) iDqS28S0300000.l2).invoke(-1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS28S0300000 iDqS28S0300000, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final IDObserverS9S0101000 iDObserverS9S0101000 = new IDObserverS9S0101000(0, (InterfaceC35811ar) iDqS28S0300000.l2, 0);
        ((LiveData) iDqS28S0300000.l0).observe((LifecycleOwner) iDqS28S0300000.l1, iDObserverS9S0101000);
        final LiveData liveData = (LiveData) iDqS28S0300000.l0;
        return new InterfaceC24580xq() { // from class: X.1E3
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                LiveData.this.removeObserver(iDObserverS9S0101000);
            }
        };
    }

    public static final Object invoke$4(IDqS28S0300000 iDqS28S0300000, Object obj) {
        String str;
        View v = (View) obj;
        o.LJIIIZ(v, "v");
        C40741io c40741io = (C40741io) iDqS28S0300000.l0;
        LiveEffect effect = (LiveEffect) iDqS28S0300000.l1;
        C20G c20g = (C20G) c40741io;
        c20g.getClass();
        o.LJIIIZ(effect, "effect");
        if (C78886Uxe.LJJIZ(c20g.LJLL)) {
            if (!C1HK.LJLJI) {
                if (c20g.LJLJLJ && C29306Beo.LJJIFFI(Boolean.valueOf(effect.isGreenScreen))) {
                    DataChannel dataChannel = c20g.LJLILLLLZI;
                    if (dataChannel == null || (str = (String) dataChannel.kv0(BDG.class)) == null) {
                        str = "";
                    }
                    C30868C9o.LJIIJJI(C29306Beo.LIZIZ(v.getContext()), str);
                } else if (c20g.LLIL(effect)) {
                    C30868C9o.LIZJ(R.string.l6p);
                }
            }
            return C76800UCe.LIZ;
        }
        C40741io c40741io2 = (C40741io) iDqS28S0300000.l0;
        LiveEffect liveEffect = (LiveEffect) iDqS28S0300000.l1;
        View view = ((RecyclerView.ViewHolder) iDqS28S0300000.l2).itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        c40741io2.LLILIL(view, liveEffect);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS28S0300000 iDqS28S0300000, Object obj) {
        LiveEffect liveEffect = (LiveEffect) iDqS28S0300000.l0;
        liveEffect.isDownloaded = true;
        liveEffect.isDownloading = false;
        liveEffect.shareImagePath = C78983UzD.LJJIIJZLJL((C31824CeK) iDqS28S0300000.l1);
        ((C40741io) iDqS28S0300000.l2).LLD((LiveEffect) iDqS28S0300000.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS28S0300000 iDqS28S0300000, Object obj) {
        int intValue = ((Number) obj).intValue();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDqS28S0300000.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(intValue));
        }
        ((BaseEffectViewModel) iDqS28S0300000.l1).jv0(intValue, iDqS28S0300000.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS28S0300000 iDqS28S0300000, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != -3) {
            if (intValue != -2) {
                if (intValue != -1) {
                    C0WN c0wn = (C0WN) iDqS28S0300000.l0;
                    if (c0wn != null) {
                        c0wn.LJFF(intValue, ((LiveEffect) iDqS28S0300000.l1).getEffect());
                    }
                } else {
                    C0WN c0wn2 = (C0WN) iDqS28S0300000.l0;
                    if (c0wn2 != null) {
                        c0wn2.onStart(((LiveEffect) iDqS28S0300000.l1).getEffect());
                    }
                }
            } else {
                C0WN c0wn3 = (C0WN) iDqS28S0300000.l0;
                if (c0wn3 != null) {
                    c0wn3.onSuccess(((LiveEffect) iDqS28S0300000.l1).getEffect());
                }
                ((StickerEffectViewModel) iDqS28S0300000.l2).kv0((C0WN) iDqS28S0300000.l0);
            }
        } else {
            C0WN c0wn4 = (C0WN) iDqS28S0300000.l0;
            if (c0wn4 != null) {
                c0wn4.LJI(((LiveEffect) iDqS28S0300000.l1).getEffect());
            }
            ((StickerEffectViewModel) iDqS28S0300000.l2).kv0((C0WN) iDqS28S0300000.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS28S0300000 iDqS28S0300000, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        boolean z = !((C1HU) iDqS28S0300000.l0).LIZIZ.containsKey(iDqS28S0300000.l1);
        Object obj = iDqS28S0300000.l1;
        if (z) {
            ((C1HU) iDqS28S0300000.l0).LIZ.remove(obj);
            ((C1HU) iDqS28S0300000.l0).LIZIZ.put(iDqS28S0300000.l1, (C0ME) iDqS28S0300000.l2);
            final C0ME c0me = (C0ME) iDqS28S0300000.l2;
            final C1HU c1hu = (C1HU) iDqS28S0300000.l0;
            final Object obj2 = iDqS28S0300000.l1;
            return new InterfaceC24580xq() { // from class: X.1HV
                @Override // X.InterfaceC24580xq
                public final void dispose() {
                    C0ME.this.LIZ(c1hu.LIZ);
                    c1hu.LIZIZ.remove(obj2);
                }
            };
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Key ");
        LIZ.append(obj);
        LIZ.append(" was used multiple times ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final Object invoke$9(IDqS28S0300000 iDqS28S0300000, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final C48211ur c48211ur = (C48211ur) iDqS28S0300000.l0;
        final Object obj = iDqS28S0300000.l1;
        final C1IC c1ic = (C1IC) iDqS28S0300000.l2;
        return new InterfaceC24580xq() { // from class: X.1I5
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                C48211ur.this.remove(obj);
                c1ic.LJ.remove(obj);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C0ME c0me, C1HU c1hu, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1hu;
        this.l1 = obj;
        this.l2 = c0me;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C0WN c0wn, StickerEffectViewModel stickerEffectViewModel, LiveEffect liveEffect, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0wn;
        this.l1 = liveEffect;
        this.l2 = stickerEffectViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(InterfaceC13090fJ interfaceC13090fJ, InterfaceC70422pa interfaceC70422pa, InterfaceC13170fR interfaceC13170fR, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC13090fJ;
        this.l1 = interfaceC70422pa;
        this.l2 = interfaceC13170fR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C14780i2 c14780i2, IDqS416S0100000 iDqS416S0100000, C68322mC c68322mC, int i) {
        super(1);
        this.$t = i;
        this.l0 = c14780i2;
        this.l1 = iDqS416S0100000;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(EnumC18670oJ enumC18670oJ, C18510o3 c18510o3, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC18670oJ;
        this.l1 = c18510o3;
        this.l2 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C18810oX c18810oX, C15010iP c15010iP, InterfaceC14950iJ interfaceC14950iJ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c18810oX;
        this.l1 = c15010iP;
        this.l2 = interfaceC14950iJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(InterfaceC24760y8 interfaceC24760y8, C07160Pw.d dVar, C07160Pw.d dVar2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC24760y8;
        this.l1 = dVar;
        this.l2 = dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C1KE c1ke, DataChannel dataChannel, Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1ke;
        this.l1 = dataChannel;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C33491Td c33491Td, MusicSong musicSong, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c33491Td;
        this.l1 = musicSong;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar<C1OJ> interfaceC35811ar2, Map<C24860yI, C1OJ> map, C1OH c1oh) {
        super(1);
        this.$t = c1oh;
        this.l0 = interfaceC35811ar;
        this.l1 = interfaceC35811ar2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(C37951eJ c37951eJ, C37951eJ c37951eJ2, SoundEffect soundEffect, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = c37951eJ;
        this.l1 = c37951eJ2;
        this.l2 = soundEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(AbstractC39201gK abstractC39201gK, InterfaceC44861pS interfaceC44861pS, C51071zT c51071zT, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC39201gK;
        this.l1 = interfaceC44861pS;
        this.l2 = c51071zT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C40741io c40741io, LiveEffect liveEffect, RecyclerView.ViewHolder viewHolder, int i) {
        super(1);
        this.$t = i;
        this.l0 = c40741io;
        this.l1 = liveEffect;
        this.l2 = viewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(C48211ur c48211ur, C48211ur<Object> c48211ur2, Object obj, C1IC<Object> c1ic) {
        super(1);
        this.$t = c1ic;
        this.l0 = c48211ur;
        this.l1 = c48211ur2;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C50941zG c50941zG, InterfaceC44861pS interfaceC44861pS, AbstractC39201gK abstractC39201gK, int i) {
        super(1);
        this.$t = i;
        this.l0 = c50941zG;
        this.l1 = interfaceC44861pS;
        this.l2 = abstractC39201gK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C50961zI c50961zI, AbstractC39201gK abstractC39201gK, InterfaceC44861pS interfaceC44861pS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c50961zI;
        this.l1 = abstractC39201gK;
        this.l2 = interfaceC44861pS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C55572Gb c55572Gb, C29321Dc c29321Dc, C68322mC c68322mC, int i) {
        super(1);
        this.$t = i;
        this.l0 = c55572Gb;
        this.l1 = c29321Dc;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(C56K c56k, C31841Mu c31841Mu, C56K c56k2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c56k;
        this.l1 = c31841Mu;
        this.l2 = c56k2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(CUC cuc, C0RI c0ri, InterfaceC266512v interfaceC266512v, int i) {
        super(1);
        this.$t = i;
        this.l0 = cuc;
        this.l1 = c0ri;
        this.l2 = interfaceC266512v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(OSZ osz, OSZ<? extends EnumC21140sI, ? extends EnumC21140sI> osz2, C279917z c279917z, KaraokeSongListFragment karaokeSongListFragment) {
        super(1);
        this.$t = karaokeSongListFragment;
        this.l0 = osz;
        this.l1 = osz2;
        this.l2 = c279917z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(XKW xkw, Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, int i) {
        super(1);
        this.$t = i;
        this.l0 = xkw;
        this.l2 = lifecycle;
        this.l1 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC35811ar<C15010iP> interfaceC35811ar, InterfaceC35811ar<String> interfaceC35811ar2) {
        super(1);
        this.$t = interfaceC35811ar2;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns2, BaseEffectViewModel<T> baseEffectViewModel, T t) {
        super(1);
        this.$t = t;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = baseEffectViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(CancellationSignal cancellationSignal, CancellationSignal cancellationSignal2, Executor executor, InterfaceC22350uF<Void, AbstractC23570wD> interfaceC22350uF) {
        super(1);
        this.$t = interfaceC22350uF;
        this.l1 = cancellationSignal;
        this.l2 = cancellationSignal2;
        this.l0 = executor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, C33811Uj c33811Uj, int i) {
        super(1);
        this.$t = i;
        this.l0 = onBackPressedDispatcher;
        this.l1 = lifecycleOwner;
        this.l2 = c33811Uj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS28S0300000(WrappedComposition wrappedComposition, WrappedComposition wrappedComposition2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, WrappedComposition wrappedComposition3) {
        super(1);
        this.$t = wrappedComposition3;
        this.l0 = wrappedComposition;
        this.l1 = wrappedComposition2;
        this.l2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(MutableLiveData mutableLiveData, LifecycleOwner lifecycleOwner, InterfaceC35811ar interfaceC35811ar, int i) {
        super(1);
        this.$t = i;
        this.l0 = mutableLiveData;
        this.l1 = lifecycleOwner;
        this.l2 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS28S0300000(LiveEffect liveEffect, C31824CeK c31824CeK, C40741io c40741io, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveEffect;
        this.l1 = c31824CeK;
        this.l2 = c40741io;
    }
}
