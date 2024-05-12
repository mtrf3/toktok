package X;

import X.C30446BxC;
import X.C63462eM;
import X.EnumC30414Bwg;
import X.XKX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMessagePlatformCommonPreferenceRedDotSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BxC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30446BxC {
    public static boolean LJ;
    public static EnumC30414Bwg LJFF;
    public static final C30446BxC LIZ = new C30446BxC();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static List<? extends EnumC30410Bwc> LJI = C61878OQg.INSTANCE;
    public static final HashMap<EnumC30414Bwg, C30448BxE> LJII = new HashMap<>();
    public static final boolean LJIIIIZZ = ((IHostUser) CN1.LIZ(IHostUser.class)).isNewUser();
    public static final int LJIIIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getShortVersionCode();
    public static final boolean LJIIJ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest();

    public static HashSet LIZ(C30446BxC c30446BxC) {
        EnumC30414Bwg enumC30414Bwg = LJFF;
        c30446BxC.getClass();
        C30448BxE c30448BxE = LJII.get(enumC30414Bwg);
        if (c30448BxE != null) {
            return c30448BxE.LIZIZ;
        }
        return null;
    }

    public static ConcurrentHashMap LIZIZ(C30446BxC c30446BxC) {
        EnumC30414Bwg enumC30414Bwg = LJFF;
        c30446BxC.getClass();
        C30448BxE c30448BxE = LJII.get(enumC30414Bwg);
        if (c30448BxE != null) {
            return c30448BxE.LIZ;
        }
        return null;
    }

    public static DataChannel LIZJ(C30446BxC c30446BxC) {
        EnumC30414Bwg enumC30414Bwg = LJFF;
        c30446BxC.getClass();
        C30448BxE c30448BxE = LJII.get(enumC30414Bwg);
        if (c30448BxE != null) {
            return c30448BxE.LIZJ;
        }
        return null;
    }

    public static void LIZLLL(LifecycleOwner lifecycleOwner, EnumC30414Bwg page, DataChannel dataChannel) {
        o.LJIIIZ(page, "page");
        LJFF = page;
        for (EnumC30410Bwc enumC30410Bwc : EnumC30410Bwc.values()) {
            enumC30410Bwc.setCurrentId("");
        }
        EnumC30410Bwc[] values = EnumC30410Bwc.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC30410Bwc enumC30410Bwc2 : values) {
            if (ORY.LJJIJIIJIL(LJFF, enumC30410Bwc2.getLivePage()) && LiveMessagePlatformCommonPreferenceRedDotSetting.INSTANCE.getValue(enumC30410Bwc2) != null) {
                arrayList.add(enumC30410Bwc2);
            }
        }
        LJI = arrayList;
        LJ(lifecycleOwner, page, dataChannel);
    }

    public static void LJ(final LifecycleOwner lifecycleOwner, final EnumC30414Bwg page, DataChannel dataChannel) {
        Lifecycle lifecycle;
        Room room;
        long j;
        o.LJIIIZ(page, "page");
        HashMap<EnumC30414Bwg, C30448BxE> hashMap = LJII;
        if (hashMap.get(page) == null) {
            hashMap.put(page, new C30448BxE());
        }
        C30448BxE c30448BxE = hashMap.get(page);
        if (c30448BxE != null) {
            c30448BxE.LIZJ = dataChannel;
            c30448BxE.LIZ.clear();
            c30448BxE.LIZIZ.clear();
        }
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            LIZIZ = String.valueOf(room.getId());
            User owner = room.getOwner();
            if (owner != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            LIZJ = String.valueOf(j);
            LiveMode streamType = room.getStreamType();
            o.LJIIIIZZ(streamType, "streamType");
            LIZLLL = C28509BGv.LIZ(streamType);
        }
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver(page, lifecycleOwner) { // from class: com.bytedance.android.live.uikit.reddot.RedDotManager$initDataChannel$4
                public final EnumC30414Bwg LJLIL;
                public final /* synthetic */ LifecycleOwner LJLILLLLZI;

                @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                public final void onCreate() {
                    LifecycleCoroutineScope lifecycleScope;
                    C30446BxC.LJ = true;
                    C30446BxC c30446BxC = C30446BxC.LIZ;
                    LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
                    c30446BxC.getClass();
                    if (C30446BxC.LJI.isEmpty() || lifecycleOwner2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2)) == null) {
                        return;
                    }
                    XKX.LIZLLL(lifecycleScope, null, null, new C63462eM(false, null), 3);
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_CREATE) {
                        onCreate();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestory();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestory() {
                    C30446BxC.LJII.remove(this.LJLIL);
                }

                {
                    this.LJLILLLLZI = lifecycleOwner;
                    this.LJLIL = page;
                }
            });
        }
    }
}
