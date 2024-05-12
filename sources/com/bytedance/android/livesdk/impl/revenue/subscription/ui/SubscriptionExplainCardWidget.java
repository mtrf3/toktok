package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.B83;
import X.C05590Jv;
import X.C16880lQ;
import X.C1EW;
import X.C1JD;
import X.C29232Bdc;
import X.C29374Bfu;
import X.C76800UCe;
import X.CN1;
import X.CV7;
import X.EnumC30915CBj;
import X.InterfaceC06390Mx;
import X.InterfaceC65784Pro;
import X.Q7L;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.UFG;
import X.UFH;
import X.UFJ;
import X.UFK;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class SubscriptionExplainCardWidget extends LiveRecyclableWidget implements UFJ {
    public Room LJLIL;
    public boolean LJLILLLLZI;
    public CV7 LJLJL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLJ;
    public boolean LJLL;
    public long LJLLI;
    public long LJLJI = -1;
    public long LJLJJI = -1;
    public final Map<String, String> LJLJJL = new LinkedHashMap();
    public EnumC30915CBj LJLJJLL = EnumC30915CBj.NULL;
    public boolean LJLJLLL = true;
    public final Handler LJLLILLLL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS49S0100000_13 LJLLJ = new ARunnableS49S0100000_13(this, 71);
    public final ARunnableS49S0100000_13 LJLLL = new ARunnableS49S0100000_13(this, 70);
    public final ARunnableS49S0100000_13 LJLLLL = new ARunnableS49S0100000_13(this, 72);

    public abstract String LJLZ(SubPinCard subPinCard, boolean z);

    public abstract int LJZ();

    public abstract void LJZI(UFH ufh);

    public abstract void LLF();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dql;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.UFJ
    public final void LJJJLIIL() {
        long j;
        String str;
        User owner;
        SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
        Room room = this.LJLIL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        int LJZ = LJZ();
        Room room2 = this.LJLIL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            str = owner.getSecUid();
        } else {
            str = null;
        }
        C1EW.LIZ(subscribeApi.unpinExplainCard(j, 0L, LJZ, str)).LJJJLIIL(new AfS65S0100000_13(this, 84), UFG.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        CV7 cv7 = this.LJLJL;
        if (cv7 != null) {
            cv7.removeAllViews();
        }
        super.hide();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLJLJ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        CV7 cv7 = this.LJLJL;
        if (cv7 != null) {
            cv7.LIZLLL();
        }
        CV7 cv72 = this.LJLJL;
        if (cv72 != null) {
            cv72.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLJLJ = null;
        if (this.LJLL && this.LJLLI == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            LJZI(UFH.OTHER);
            this.LJLLI = 0L;
        }
        this.LJLJI = -1L;
        this.LJLJJI = -1L;
        ((LinkedHashMap) this.LJLJJL).clear();
        this.LJLLILLLL.removeCallbacksAndMessages(null);
        UFK.LJLILLLLZI.LJII(LJZ());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        CV7 cv7 = this.LJLJL;
        if (cv7 != null && !cv7.LJLJJLL) {
            cv7.LJLJJLL = true;
            cv7.requestLayout();
        }
    }

    @Override // X.UFJ
    public final void LJLJJL(Map<String, String> map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        linkedHashMap.clear();
        linkedHashMap.putAll(map);
        if (this.LJLJLLL) {
            LL(true);
        } else {
            LLF();
        }
    }

    public final void LL(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isConfirm", z);
        jSONObject.put("pinCardType", LJZ());
        C1JD.LJJIJL("subscription_pin_card_response", jSONObject, 4);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        CV7 cv7 = (CV7) findViewById(R.id.b5l);
        this.LJLJL = cv7;
        if (cv7 == null) {
            return;
        }
        cv7.setAnimationDuration(300L);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        SubPinCard subPinCard;
        this.LJLIL = (Room) this.dataChannel.kv0(RoomChannel.class);
        Boolean bool = (Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        int LJZ = LJZ();
        Room room = this.LJLIL;
        UFK.LJLILLLLZI.LJI(LJZ, this);
        if (room != null && (subPinCard = room.subPinCard) != null) {
            UFK.LIZ(subPinCard, null, new AqS155S0100000_5(room, 445), 2);
        }
    }

    @Override // X.UFJ
    public final void LJLIIIL(boolean z, EnumC30915CBj conflictState) {
        o.LJIIIZ(conflictState, "conflictState");
        this.LJLJLLL = z;
        this.LJLJJLL = conflictState;
        if (!z) {
            LJJJJIZL(UFH.REPLACED, Long.valueOf(this.LJLLI));
        }
    }

    public final boolean LLFF(UFH reason, Long l) {
        o.LJIIIZ(reason, "reason");
        if (!this.LJLL) {
            return false;
        }
        this.LJLLILLLL.removeCallbacksAndMessages(null);
        CV7 cv7 = this.LJLJL;
        if (cv7 != null) {
            cv7.LIZLLL();
        }
        this.LJLLILLLL.postDelayed(this.LJLLL, 300L);
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (l != null && l.longValue() == currentUserId) {
            LJZI(reason);
            this.LJLLI = 0L;
        }
        this.LJLL = false;
        this.LJLJI = -1L;
        this.LJLJJI = -1L;
        ((LinkedHashMap) this.LJLJJL).clear();
        return true;
    }

    public final boolean LJZL(SubPinCard subPinCard, Long l, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        long j;
        long j2;
        int LJZ = LJZ();
        long j3 = 0;
        if (LJZ != 1) {
            if (LJZ != 2) {
                j2 = 0;
                boolean z = false;
                if (!this.LJLL || C29232Bdc.LJFF(this.dataChannel) || j2 <= System.currentTimeMillis()) {
                    return false;
                }
                this.LJLLILLLL.removeCallbacksAndMessages(null);
                this.LJLL = true;
                this.LJLJI = SystemClock.elapsedRealtime();
                if (l != null) {
                    j3 = l.longValue();
                }
                this.LJLLI = j3;
                InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
                o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
                IHybridContainerService iHybridContainerService = (IHybridContainerService) LIZ;
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                if (this.LJLLI == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                    z = true;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = C05590Jv.LIZIZ(iHybridContainerService, context, LJLZ(subPinCard, z), false, null, 12);
                this.LJLJLJ = LIZIZ;
                CV7 cv7 = this.LJLJL;
                if (cv7 != null) {
                    cv7.addView(LIZIZ, -1, -1);
                }
                this.LJLLILLLL.postDelayed(this.LJLLJ, 300L);
                this.LJLLILLLL.postDelayed(this.LJLLLL, j2 - System.currentTimeMillis());
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                return true;
            }
            SubGoalPinCard subGoalPinCard = subPinCard.goalPinCard;
            if (subGoalPinCard != null) {
                j = subGoalPinCard.timeToLive;
            } else {
                j = 0;
            }
        } else {
            j = subPinCard.timeToLive;
        }
        j2 = j * 1000;
        boolean z2 = false;
        if (!this.LJLL) {
        }
        return false;
    }
}
