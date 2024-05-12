package X;

import Y.IDfS292S0100000;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.AllEffectFetchSuccessChannel;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.RemoveCoHostSameInsertStickerEvent;
import com.bytedance.android.live.effect.api.StopCurrentInsertStickerEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveValidPeriodOfInsertStickerSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveCohostSameEffectDisplayMaxCountSetting;
import com.bytedance.android.livesdk.model.message.AnchorToolModification;
import com.bytedance.android.livesdk.model.message.AnchorToolModificationMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40641ie implements InterfaceC31961Ng {
    public static DataChannel LJLILLLLZI;
    public static C0WZ LJLJJLL;
    public static Handler LJLJL;
    public static final C40641ie LJLIL = new C40641ie();
    public static final HashMap<String, ArrayList<ImageModel>> LJLJI = new HashMap<>();
    public static final Queue<C0WZ> LJLJJI = new PriorityBlockingQueue(4, new Comparator() { // from class: X.0WX
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C0WZ o1 = (C0WZ) obj;
            C0WZ o2 = (C0WZ) obj2;
            o.LJIIIZ(o1, "o1");
            o.LJIIIZ(o2, "o2");
            if (o2.LJ.getPriority() > o1.LJ.getPriority()) {
                return 1;
            }
            if (o2.LJ.getPriority() >= o1.LJ.getPriority()) {
                EnumC08760Wa enumC08760Wa = o1.LJ;
                EnumC08760Wa enumC08760Wa2 = EnumC08760Wa.CO_HOST_SAME;
                if (enumC08760Wa == enumC08760Wa2 && o2.LJ == enumC08760Wa2) {
                    return o.LJIIL(o2.LIZJ, o1.LIZJ);
                }
                if (enumC08760Wa != enumC08760Wa2) {
                    return 1;
                }
            }
            return -1;
        }
    });
    public static final java.util.Set<LiveEffect> LJLJJL = new LinkedHashSet();
    public static final ConcurrentHashMap<Long, C31951Nf> LJLJLJ = new ConcurrentHashMap<>();

    public static List LIZJ() {
        boolean z;
        try {
            Queue<C0WZ> queue = LJLJJI;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((PriorityBlockingQueue) queue).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C0WZ c0wz = (C0WZ) next;
                if (c0wz.LJ == EnumC08760Wa.CO_HOST_SAME && c0wz.LIZ != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = ((C0WZ) it2.next()).LIZ;
                o.LJI(liveEffect);
                arrayList2.add(liveEffect);
            }
            return arrayList2;
        } catch (NullPointerException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("elements: ");
            Queue<C0WZ> queue2 = LJLJJI;
            LIZ.append(ORZ.LLD(queue2, ",", null, null, null, 62));
            C0NB.LJ("InsertStickerManager", X1D.LIZIZ(LIZ));
            HashMap hashMap = new HashMap();
            hashMap.put("error_type", "getInsertStickers_NullPointerException");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("elements", ORZ.LLD(queue2, ",", null, null, null, 62));
            String stackTraceString = android.util.Log.getStackTraceString(e);
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(e)");
            hashMap2.put("error_stack", stackTraceString);
            C0K2.LJFF("ttlive_quality_stability_error", hashMap, null, hashMap2);
            return C61878OQg.INSTANCE;
        }
    }

    @Override // X.InterfaceC31961Ng
    public final boolean Nq0() {
        EnumC08760Wa enumC08760Wa;
        C0WZ c0wz = LJLJJLL;
        if (c0wz != null) {
            enumC08760Wa = c0wz.LJ;
        } else {
            enumC08760Wa = null;
        }
        if (enumC08760Wa == EnumC08760Wa.CO_HOST_SAME) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31961Ng
    public final String Zu() {
        C31951Nf c31951Nf;
        String str;
        C0WZ c0wz = LJLJJLL;
        if (c0wz == null || (c31951Nf = LJLJLJ.get(Long.valueOf(c0wz.LIZIZ))) == null || (str = c31951Nf.LJLILLLLZI) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC31961Ng
    public final void r40() {
        C29306Beo.LJJIJIL(LJLJJI, C46461s2.LJLIL);
        LJLJJLL = null;
    }

    @Override // X.InterfaceC31961Ng
    public final void release() {
        LJLJI.clear();
        ((PriorityBlockingQueue) LJLJJI).clear();
        LJLJJLL = null;
        Handler handler = LJLJL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        DataChannel dataChannel = LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.pv0(StopCurrentInsertStickerEvent.class);
        }
        LJLJL = null;
        LJLJLJ.clear();
        LJLJJL.clear();
        LJLILLLLZI = null;
    }

    @Override // X.InterfaceC31961Ng
    public final void vm0() {
        Object obj;
        C37 c37;
        Iterator it = ((PriorityBlockingQueue) LJLJJI).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((C0WZ) obj).LJFF) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C0WZ c0wz = (C0WZ) obj;
        if (c0wz == null) {
            return;
        }
        C0WZ c0wz2 = LJLJJLL;
        if (c0wz2 == null || c0wz.LJ.getPriority() >= c0wz2.LJ.getPriority()) {
            C42681lw LIZ = C12880ey.LIZ();
            String STICKER = C0TY.LIZIZ;
            o.LJIIIIZZ(STICKER, "STICKER");
            if (o.LJ(ORZ.LJLLLL(LIZ.LIZ(STICKER)), c0wz.LIZ)) {
                c0wz.LJFF = true;
                vm0();
                return;
            }
            if (c0wz.LJ == EnumC08760Wa.CO_HOST_SAME) {
                long LIZ2 = C30725C4b.LIZ();
                long j = c0wz.LIZJ + 10000;
                if (LIZ2 >= j) {
                    c0wz.LJFF = true;
                    LJLJJLL = c0wz;
                    DataChannel dataChannel = LJLILLLLZI;
                    if (dataChannel != null) {
                        dataChannel.qv0(NewInsertStickerEvent.class, c0wz);
                        return;
                    }
                    return;
                }
                long j2 = j - LIZ2;
                Handler handler = LJLJL;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = LJLJL;
                if (handler2 == null) {
                    return;
                }
                handler2.postDelayed(new Runnable() { // from class: X.0Eb
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ3;
                        try {
                            C40641ie.LJLIL.vm0();
                        } finally {
                            if (LIZ3) {
                            }
                        }
                    }
                }, j2);
                return;
            }
            LiveEffect liveEffect = c0wz.LIZ;
            if (liveEffect != null) {
                C48459J0d<java.util.Set<String>> c48459J0d = InterfaceC30442Bx8.v;
                c48459J0d.LIZJ().add(liveEffect.getResourceId());
                c48459J0d.LIZLLL();
                if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isExperiment() && (c37 = (C37) DataChannelGlobal.LJLJJI.mv0(BroadcastSceneGlobalChannel.class)) != null) {
                    C48459J0d<java.util.Map<String, String>> c48459J0d2 = InterfaceC30442Bx8.d3;
                    java.util.Map<String, String> value = c48459J0d2.LIZJ();
                    o.LJIIIIZZ(value, "value");
                    value.put(c37.getValue(), String.valueOf(System.currentTimeMillis()));
                    c48459J0d2.LIZLLL();
                }
            }
            c0wz.LJFF = true;
            LJLJJLL = c0wz;
            DataChannel dataChannel2 = LJLILLLLZI;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.qv0(NewInsertStickerEvent.class, c0wz);
        }
    }

    @Override // X.InterfaceC31961Ng
    public final C0WZ kZ() {
        return LJLJJLL;
    }

    public static boolean LIZLLL(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Queue<C0WZ> queue = LJLJJI;
        if ((queue instanceof Collection) && queue.isEmpty()) {
            return false;
        }
        Iterator it = ((PriorityBlockingQueue) queue).iterator();
        while (it.hasNext()) {
            C0WZ c0wz = (C0WZ) it.next();
            LiveEffect liveEffect = c0wz.LIZ;
            if (liveEffect != null) {
                str2 = liveEffect.getResourceId();
            } else {
                str2 = null;
            }
            if (o.LJ(str2, str) && c0wz.LJ == EnumC08760Wa.CO_HOST_SAME) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(LiveEffect liveEffect) {
        long j;
        if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isExperiment()) {
            long currentTimeMillis = System.currentTimeMillis();
            Effect effect = liveEffect.getEffect();
            if (effect != null) {
                j = effect.getPtime();
            } else {
                j = 0;
            }
            if (currentTimeMillis - j >= LiveValidPeriodOfInsertStickerSetting.INSTANCE.getValue() * 1000) {
                return false;
            }
        }
        return true;
    }

    public static void LJI(EnumC08760Wa insertStickerType) {
        EnumC08760Wa enumC08760Wa;
        o.LJIIIZ(insertStickerType, "insertStickerType");
        ORS.LJJLIIJ(LJLJJI, new IDqS416S0100000(insertStickerType, 14));
        C0WZ c0wz = LJLJJLL;
        if (c0wz != null) {
            enumC08760Wa = c0wz.LJ;
        } else {
            enumC08760Wa = null;
        }
        if (enumC08760Wa == insertStickerType) {
            LJLJJLL = null;
            DataChannel dataChannel = LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.pv0(StopCurrentInsertStickerEvent.class);
            }
        }
        if (insertStickerType == EnumC08760Wa.CO_HOST_SAME) {
            LJLJI.clear();
            Handler handler = LJLJL;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            DataChannel dataChannel2 = LJLILLLLZI;
            if (dataChannel2 != null) {
                dataChannel2.pv0(RemoveCoHostSameInsertStickerEvent.class);
            }
        }
    }

    public final synchronized void LIZIZ(C0WZ c0wz) {
        Effect effect;
        int i;
        Effect effect2;
        if (C29306Beo.LJJIFFI(Boolean.valueOf(C39591gx.LIZIZ(c0wz.LIZ)))) {
            return;
        }
        EnumC08760Wa enumC08760Wa = c0wz.LJ;
        Object obj = null;
        if (enumC08760Wa != EnumC08760Wa.CO_HOST_SAME && enumC08760Wa.isSticker()) {
            Queue<C0WZ> queue = LJLJJI;
            if (!(queue instanceof Collection) || !queue.isEmpty()) {
                Iterator it = ((PriorityBlockingQueue) queue).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    C0WZ c0wz2 = (C0WZ) it.next();
                    if (c0wz2.LJ == EnumC08760Wa.CO_HOST_SAME && C29306Beo.LJIILLIIL(Boolean.valueOf(c0wz2.LJFF)) && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
                if (i2 > 0) {
                    return;
                }
            }
        }
        C1KJ c1kj = C1KJ.LIZ;
        LiveEffect liveEffect = c0wz.LIZ;
        if (liveEffect != null) {
            effect = liveEffect.getEffect();
        } else {
            effect = null;
        }
        if (!C1KJ.LJIIL(effect)) {
            LiveEffect liveEffect2 = c0wz.LIZ;
            if (liveEffect2 != null) {
                effect2 = liveEffect2.getEffect();
            } else {
                effect2 = null;
            }
            c1kj.LIZLLL(effect2, null);
        }
        EnumC08760Wa enumC08760Wa2 = c0wz.LJ;
        if (enumC08760Wa2 == EnumC08760Wa.CO_HOST_SAME) {
            Queue<C0WZ> queue2 = LJLJJI;
            if ((queue2 instanceof Collection) && queue2.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = ((PriorityBlockingQueue) queue2).iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((C0WZ) it2.next()).LJ == EnumC08760Wa.CO_HOST_SAME && (i = i + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            if (i > LiveCohostSameEffectDisplayMaxCountSetting.INSTANCE.getValue()) {
                Iterator it3 = ((PriorityBlockingQueue) LJLJJI).iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((C0WZ) next).LJ == EnumC08760Wa.CO_HOST_SAME) {
                        obj = next;
                    }
                }
                ((PriorityBlockingQueue) LJLJJI).remove((C0WZ) obj);
            }
            C29306Beo.LJJIJIL(LJLJJI, new IDqS416S0100000(c0wz, 13));
        } else if (enumC08760Wa2.isSticker()) {
            C29306Beo.LJJIJIL(LJLJJI, C46421ry.LJLIL);
        }
        ((PriorityBlockingQueue) LJLJJI).offer(c0wz);
        vm0();
    }

    @Override // X.InterfaceC31961Ng
    public final ImageModel Ut0(long j) {
        C31951Nf c31951Nf = LJLJLJ.get(Long.valueOf(j));
        if (c31951Nf != null) {
            return c31951Nf.LJLJI;
        }
        return null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LiveEffect liveEffect;
        String str;
        String str2;
        if (iMessage instanceof AnchorToolModificationMessage) {
            AnchorToolModification anchorToolModification = ((AnchorToolModificationMessage) iMessage).modification;
            if (anchorToolModification.modificationType == 1) {
                final long j = anchorToolModification.userId;
                final String str3 = anchorToolModification.resourceId;
                long j2 = anchorToolModification.startTime * 1000;
                long j3 = anchorToolModification.endTime * 1000;
                Room LJJIJLIJ = C29306Beo.LJJIJLIJ(LJLILLLLZI);
                if (LJJIJLIJ != null && j == LJJIJLIJ.getOwnerUserId()) {
                    return;
                }
                LiveEffect liveEffect2 = null;
                if (j3 != 0) {
                    if (j3 - j2 < 10000) {
                        Iterator it = ((PriorityBlockingQueue) LJLJJI).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            C0WZ c0wz = (C0WZ) next;
                            if (c0wz.LIZIZ == j) {
                                LiveEffect liveEffect3 = c0wz.LIZ;
                                if (liveEffect3 != null) {
                                    str2 = liveEffect3.getResourceId();
                                } else {
                                    str2 = null;
                                }
                                if (o.LJ(str2, str3) && c0wz.LIZJ == j2) {
                                    if (next != null) {
                                        ((PriorityBlockingQueue) LJLJJI).remove(next);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                if (j2 == 0) {
                    return;
                }
                Iterator<LiveEffect> it2 = LJLJJL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        liveEffect = it2.next();
                        if (o.LJ(liveEffect.getResourceId(), str3)) {
                            break;
                        }
                    } else {
                        liveEffect = null;
                        break;
                    }
                }
                LiveEffect liveEffect4 = liveEffect;
                if (liveEffect4 != null && liveEffect4.parentResId != null) {
                    Iterator<LiveEffect> it3 = LJLJJL.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        LiveEffect next2 = it3.next();
                        String resourceId = next2.getResourceId();
                        if (liveEffect4 != null) {
                            str = liveEffect4.parentResId;
                        } else {
                            str = null;
                        }
                        if (o.LJ(resourceId, str)) {
                            liveEffect2 = next2;
                            break;
                        }
                    }
                    liveEffect = liveEffect2;
                }
                LiveEffect liveEffect5 = liveEffect;
                if (liveEffect5 == null) {
                    return;
                }
                ConcurrentHashMap<Long, C31951Nf> concurrentHashMap = LJLJLJ;
                if (concurrentHashMap.containsKey(Long.valueOf(j))) {
                    LJLIL.LIZ(liveEffect5, j, j2);
                    return;
                }
                C40641ie c40641ie = LJLIL;
                final C46451s1 c46451s1 = new C46451s1(liveEffect5, j, j2);
                c40641ie.getClass();
                if (concurrentHashMap.containsKey(Long.valueOf(j))) {
                    return;
                }
                ((C29374Bfu) B83.LIZ().LIZIZ()).LJIILLIIL(j, "InsertStickerManager_getUserInfoById", "insertSticker_fromMessag").LJIJJ(C73969T1h.LIZIZ()).LJJII(new InterfaceC64592gB() { // from class: X.1E0
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        Boolean bool;
                        ArrayList<ImageModel> arrayList;
                        User user = (User) obj;
                        o.LJIIIZ(user, "user");
                        ConcurrentHashMap<Long, C31951Nf> concurrentHashMap2 = C40641ie.LJLJLJ;
                        Long valueOf = Long.valueOf(j);
                        long j4 = j;
                        String LIZ = C05170If.LIZ(user);
                        o.LJIIIIZZ(LIZ, "getDisplayName(user)");
                        ImageModel avatarThumb = user.getAvatarThumb();
                        o.LJIIIIZZ(avatarThumb, "user.avatarThumb");
                        concurrentHashMap2.put(valueOf, new C31951Nf(j4, LIZ, avatarThumb));
                        HashMap<String, ArrayList<ImageModel>> hashMap = C40641ie.LJLJI;
                        ArrayList<ImageModel> arrayList2 = hashMap.get(str3);
                        if (arrayList2 != null) {
                            bool = Boolean.valueOf(arrayList2.contains(user.getAvatarThumb()));
                        } else {
                            bool = null;
                        }
                        if (C29306Beo.LJIILLIIL(bool) && (arrayList = hashMap.get(str3)) != null) {
                            arrayList.add(user.getAvatarThumb());
                        }
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c46451s1;
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                        }
                    }
                }, new IDfS292S0100000(c46451s1, 3));
            }
        }
    }

    @Override // X.InterfaceC31961Ng
    public final void JL(LifecycleOwner lifecycleOwner, final DataChannel dataChannel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LJLILLLLZI = dataChannel;
        dataChannel.mv0(LinkCrossRoomStateChangeEvent.class, this, C46431rz.LJLIL);
        dataChannel.mv0(AllEffectFetchSuccessChannel.class, this, C46441s0.LJLIL);
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ANCHOR_TOOL_MODIFICATION_MESSAGE.getIntType(), this);
        }
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        C1KJ.LJIIJ(STICKER, new V0N(), new FH4(), new C0WO<LiveEffect>(dataChannel) { // from class: X.1KN
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0WO
            public final void onFail() {
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // X.C0WO
            public final void onSuccess(List<C1QC> effectPanelList) {
                o.LJIIIZ(effectPanelList, "effectPanelList");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C1QC c1qc : effectPanelList) {
                    linkedHashSet.addAll(c1qc.LJLILLLLZI);
                    linkedHashSet.addAll(c1qc.LJLJJLL);
                }
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.rv0(AllEffectFetchSuccessChannel.class, linkedHashSet);
                }
            }
        });
        LJLJL = new Handler(C16880lQ.LLJJJJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0WZ LJFF(java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r16, X.C37 r17) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40641ie.LJFF(java.util.List, X.C37):X.0WZ");
    }

    public final void LIZ(LiveEffect liveEffect, long j, long j2) {
        Boolean bool;
        ArrayList<ImageModel> arrayList;
        HashMap<String, ArrayList<ImageModel>> hashMap = LJLJI;
        if (!hashMap.containsKey(liveEffect.getResourceId())) {
            hashMap.put(liveEffect.getResourceId(), new ArrayList<>());
        }
        ImageModel Ut0 = Ut0(j);
        if (Ut0 != null) {
            ArrayList<ImageModel> arrayList2 = hashMap.get(liveEffect.getResourceId());
            if (arrayList2 != null) {
                bool = Boolean.valueOf(arrayList2.contains(Ut0));
            } else {
                bool = null;
            }
            if (C29306Beo.LJIILLIIL(bool) && (arrayList = hashMap.get(liveEffect.getResourceId())) != null) {
                arrayList.add(Ut0);
            }
        }
        liveEffect.isFromOtherUser = true;
        LIZIZ(new C0WZ(liveEffect, j, j2, EnumC08760Wa.CO_HOST_SAME));
    }
}
