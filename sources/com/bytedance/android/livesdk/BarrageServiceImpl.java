package com.bytedance.android.livesdk;

import X.ActivityC45651qj;
import X.B83;
import X.C16880lQ;
import X.C28660BMq;
import X.C29374Bfu;
import X.C29778BmQ;
import X.C29783BmV;
import X.C29785BmX;
import X.C29982Bpi;
import X.C30024BqO;
import X.InterfaceC29980Bpg;
import X.InterfaceC30182Bsw;
import X.Q7L;
import X.X1D;
import android.content.Context;
import android.util.LruCache;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeApi;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveOptimizedLikeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class BarrageServiceImpl implements GenericLifecycleObserver, IBarrageService {
    public final Map<Long, InterfaceC29980Bpg> LJLIL = new HashMap();
    public final LruCache<Long, C28660BMq> LJLILLLLZI = new LruCache<>(5);

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void W0() {
        ((LikeApi) Q7L.LIZIZ(LikeApi.class)).getIcons(0L, 0L, LiveLikePerformanceOptimizeSettings.INSTANCE.enablePerformanceOptimize() ? 1L : 0L);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final List<String> gj0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("K");
        arrayList.add("M");
        arrayList.add("B");
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final List<Class<? extends LiveRecyclableWidget>> oS() {
        GenericDeclaration genericDeclaration;
        GenericDeclaration genericDeclaration2;
        GenericDeclaration genericDeclaration3;
        ArrayList arrayList = new ArrayList();
        LiveOptimizedLikeSetting liveOptimizedLikeSetting = LiveOptimizedLikeSetting.INSTANCE;
        if (liveOptimizedLikeSetting.getValue()) {
            genericDeclaration = SelfLikeViewOptimizedWidget.class;
        } else {
            genericDeclaration = SelfLikeWidget.class;
        }
        arrayList.add(genericDeclaration);
        if (liveOptimizedLikeSetting.getValue()) {
            genericDeclaration2 = OthersLikeViewOptimizedWidget.class;
        } else {
            genericDeclaration2 = OthersLikeWidget.class;
        }
        arrayList.add(genericDeclaration2);
        if (LiveSelfLinkedLikeBehaviorSetting.INSTANCE.isSelfLikeLinkedBreathAnimatorEnable()) {
            if (LiveLikePerformanceOptimizeSettings.INSTANCE.enablePerformanceOptimize()) {
                genericDeclaration3 = LikeUserInfoAnimOptimizedWidget.class;
            } else {
                genericDeclaration3 = LikeUserInfoAnimWidget.class;
            }
            arrayList.add(genericDeclaration3);
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final Class w40() {
        if (LiveLikePerformanceOptimizeSettings.INSTANCE.enablePerformanceOptimize()) {
            return LikeUserInfoAnimOptimizedWidget.class;
        }
        return LikeUserInfoAnimWidget.class;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final Class<? extends LiveRecyclableWidget> Oa(InterfaceC29980Bpg interfaceC29980Bpg) {
        if (!interfaceC29980Bpg.LJI()) {
            C29982Bpi.LIZJ = "OthersLikeWidget";
            return OthersLikeWidget.class;
        }
        C29982Bpi.LIZJ = "OthersLikeViewOptimizedWidget";
        return OthersLikeViewOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final Class<? extends LiveRecyclableWidget> Rc0(InterfaceC29980Bpg interfaceC29980Bpg) {
        if (!interfaceC29980Bpg.LJI()) {
            return SelfLikeWidget.class;
        }
        return SelfLikeViewOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final InterfaceC29980Bpg hq0(long j) {
        return (InterfaceC29980Bpg) ((HashMap) this.LJLIL).get(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final String j90(long j) {
        if (j < 0) {
            return "";
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLLZI(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j / 100)) / 10.0f)}));
            LIZ.append('K');
            return X1D.LIZIZ(LIZ);
        }
        if (j < 1000000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLLZI(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j / 100000)) / 10.0f)}));
            LIZ2.append('M');
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C16880lQ.LLLZI(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j / 100000000)) / 10.0f)}));
        LIZ3.append('B');
        return X1D.LIZIZ(LIZ3);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final C28660BMq wm0(long j) {
        C28660BMq c28660BMq = this.LJLILLLLZI.get(Long.valueOf(j));
        if (c28660BMq != null) {
            return c28660BMq;
        }
        return new C28660BMq();
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void zM(long j) {
        InterfaceC29980Bpg interfaceC29980Bpg = (InterfaceC29980Bpg) ((HashMap) this.LJLIL).remove(Long.valueOf(j));
        if (interfaceC29980Bpg != null && WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            interfaceC29980Bpg.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void hk0(long j, C28660BMq c28660BMq) {
        this.LJLILLLLZI.put(Long.valueOf(j), c28660BMq);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void x90(Fragment fragment, DataChannel dataChannel, InterfaceC30182Bsw interfaceC30182Bsw) {
        new C29783BmV(fragment, dataChannel, interfaceC30182Bsw);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final C29778BmQ pw(DataChannel dataChannel, Context context, Room room, boolean z, ViewGroup viewGroup) {
        return new C29778BmQ(dataChannel, context, room, viewGroup);
    }

    public static void LIZ(Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel, LikeHelper likeHelper) {
        String str;
        String str2;
        String str3;
        String str4;
        if (likeHelper.LLF) {
            str3 = "disabled_due_to_landscape_mode";
            str2 = "enabled";
            if (!z) {
                str = "disabled_due_to_landscape_mode";
            } else {
                str = "enabled";
            }
            if (z2) {
                str3 = "enabled";
            }
            if (z3) {
                str4 = "enabled";
            } else {
                str4 = "disabled_due_to_being_audience_and_mic_room";
            }
        } else {
            str = null;
            if (!room.getRoomAuthStatus().isEnableDigg()) {
                str2 = "disabled_by_room_auth";
            } else if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
                str2 = "disabled_due_to_unlogin";
            } else if (((Boolean) dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue() && DiggParamsSetting.INSTANCE.getValue().likeStyle != 1) {
                str2 = "disabled_due_to_being_anchor_and_ab";
            } else {
                str2 = null;
            }
            str3 = null;
            str4 = null;
        }
        C30024BqO.LIZ(room.getId(), ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), room.getOwnerUserId(), str2, str, str3, str4);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void N60(ActivityC45651qj activityC45651qj, LifecycleOwner lifecycleOwner, Room room, C29785BmX c29785BmX, boolean z, boolean z2, DataChannel dataChannel) {
        LikeHelper optimizedLikeHelper;
        if (activityC45651qj == null || lifecycleOwner == null || dataChannel == null) {
            return;
        }
        if (room.getRoomAuthStatus() == null) {
            C30024BqO.LIZ(room.getId(), ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), room.getOwnerUserId(), "disabled_due_to_empty_room_auth", null, null, null);
            return;
        }
        activityC45651qj.getLifecycle().addObserver(this);
        if (!LiveOptimizedLikeSetting.INSTANCE.getValue()) {
            optimizedLikeHelper = new LikeHelper(activityC45651qj, lifecycleOwner, room, z, z2, dataChannel);
        } else {
            optimizedLikeHelper = new OptimizedLikeHelper(activityC45651qj, lifecycleOwner, room, z, z2, dataChannel);
        }
        LIZ(room, true, z, z2, dataChannel, optimizedLikeHelper);
        ((HashMap) this.LJLIL).put(Long.valueOf(room.getId()), optimizedLikeHelper);
        InterfaceC30182Bsw interfaceC30182Bsw = c29785BmX.LIZ.LIZ;
        if (interfaceC30182Bsw == null) {
            return;
        }
        interfaceC30182Bsw.LJJJLL(optimizedLikeHelper.LJLJJI);
    }
}
