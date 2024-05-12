package com.bytedance.android.live.publicscreen.impl.caption;

import X.AbstractC019505v;
import X.BJM;
import X.BZI;
import X.C0NB;
import X.C28787BRn;
import X.C29296Bee;
import X.C29299Beh;
import X.C29305Ben;
import X.C29927Bop;
import X.C47121t6;
import X.C47261Igj;
import X.C87277YNd;
import X.CCJ;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC30442Bx8;
import Y.AObserverS73S0100000_5;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionDeleteEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionLanguageChannel;
import com.bytedance.android.livesdk.dataChannel.CaptionStartShowEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTextTouchEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTextTouchMoveEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTypeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV3Setting;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CaptionTextWidget extends LiveRecyclableWidget implements OnMessageListener {
    public static final float LLIIII = C87277YNd.LJIIJ(219);
    public static final float LLIIIILZ = C87277YNd.LJIIJ(12);
    public float LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public View LJLJLLL;
    public TextView LJLL;
    public TextView LJLLI;
    public C29305Ben LJLLILLLL;
    public LiveIconView LJLLJ;
    public C47121t6 LJLLL;
    public LinearLayout LJLLLL;
    public CaptionViewModel LJLLLLLL;
    public long LJZ;
    public long LJZI;
    public C29296Bee LJZL;
    public IMessageManager LL;
    public long LLFF;
    public long LLFFF;
    public long LLFII;
    public Room LLFZ;
    public CaptionInfo LLI;
    public final String LLIFFJFJJ;
    public String LLII;
    public volatile boolean LJLJLJ = true;
    public final ArrayList<TextView> LJLZ = new ArrayList<>();
    public final C29299Beh LLD = new C29299Beh("", 0.0f);
    public final C29299Beh LLF = new C29299Beh("", 0.0f);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnq;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Map<String, String> LJLZ() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.LLFF));
        hashMap.put("room_id", String.valueOf(this.LLFFF));
        hashMap.put("app_language", this.LLIFFJFJJ);
        hashMap.put("caption_language", this.LLII);
        if (this.LJLJI) {
            str = "translational";
        } else {
            str = "original";
        }
        hashMap.put("caption_type", str);
        hashMap.put("device_model", Build.MODEL);
        return hashMap;
    }

    public final void LJZI() {
        if (this.LJLJLJ) {
            this.LJLJLJ = false;
            BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_start");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIFFI(LJLZ());
            LIZ.LJJIIJZLJL();
        }
    }

    public final void LL() {
        if (!this.LJLJJLL && !this.LJLJJL) {
            Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
            if (LIZJ.booleanValue()) {
                show();
                C0NB.LIZIZ("captiontextwidget", "show");
                return;
            }
        }
        hide();
        C0NB.LIZIZ("captiontextwidget", "hide");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveRecycleWidgetV3Setting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLLLLLL = null;
        Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (LIZJ.booleanValue()) {
            LJZ("leave");
        }
        this.LJLZ.clear();
        this.LJZL = null;
        this.LLI = null;
    }

    public CaptionTextWidget() {
        String language = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
        this.LLIFFJFJJ = language;
        this.LLII = language;
    }

    public final void LJZ(String str) {
        long j;
        Long l = (Long) this.dataChannel.kv0(CaptionStartShowEvent.class);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if ((!o.LJ(str, "leave") || this.LLFII == 0) && (j == 0 || this.LJLJL)) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_duration");
        LIZ.LJIILLIIL(this.dataChannel);
        Map<String, String> LJLZ = LJLZ();
        HashMap hashMap = (HashMap) LJLZ;
        hashMap.put("reason", str);
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        long j2 = 1000;
        hashMap.put("duration", String.valueOf(elapsedRealtime / j2));
        if (o.LJ(str, "leave")) {
            hashMap.put("duration", String.valueOf((SystemClock.elapsedRealtime() - this.LLFII) / j2));
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("action_type", BJM.LIZLLL());
        }
        LIZ.LJJIFFI(LJLZ);
        LIZ.LJJIIJZLJL();
        this.dataChannel.rv0(CaptionStartShowEvent.class, 0L);
        if (!o.LJ(str, "close") && !o.LJ(str, "leave")) {
            return;
        }
        this.LJLJL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLLILLLL = (C29305Ben) findViewById(R.id.l4m);
        this.LJLLL = (C47121t6) findViewById(R.id.cgy);
        this.LJLL = (TextView) findViewById(R.id.l4b);
        this.LJLLI = (TextView) findViewById(R.id.l51);
        this.LJLLLL = (LinearLayout) findViewById(R.id.l4w);
        this.LJLJLLL = findViewById(R.id.b4o);
        this.LJLLJ = (LiveIconView) findViewById(R.id.lk2);
        AbstractC019505v abstractC019505v = (AbstractC019505v) findViewById(R.id.agt);
        if (abstractC019505v == null) {
            return;
        }
        abstractC019505v.setReferencedIds(new int[]{R.id.l4b, R.id.l51, R.id.cgy});
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Room room;
        long j;
        long j2;
        String str;
        int i;
        MutableLiveData<C29296Bee> mutableLiveData;
        C47121t6 c47121t6;
        User owner;
        List<String> list;
        User owner2;
        this.LJLIL = 0.0f;
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLJLJ = true;
        DataChannel dataChannel = this.dataChannel;
        CaptionInfo captionInfo = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.CONTROL.getIntType(), this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLFZ = room;
        if (room != null) {
            captionInfo = room.captionInfo;
        }
        this.LLI = captionInfo;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LLFFF = j;
        Room room2 = this.LLFZ;
        if (room2 != null && (owner2 = room2.getOwner()) != null) {
            j2 = owner2.getId();
        } else {
            j2 = 0;
        }
        this.LLFF = j2;
        CaptionInfo captionInfo2 = this.LLI;
        if (captionInfo2 != null && (list = captionInfo2.supportLang) != null && (!list.isEmpty())) {
            if (list.contains(this.LLIFFJFJJ)) {
                this.LLII = this.LLIFFJFJJ;
                this.LJLJI = !o.LJ(ListProtector.get(list, 0), this.LLIFFJFJJ);
            } else {
                this.LLII = (String) ListProtector.get(list, 0);
                this.LJLJI = false;
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        String captionLanguage = this.LLII;
        o.LJIIIIZZ(captionLanguage, "captionLanguage");
        dataChannel3.rv0(CaptionLanguageChannel.class, captionLanguage);
        DataChannel dataChannel4 = this.dataChannel;
        if (this.LJLJI) {
            str = "translational";
        } else {
            str = "original";
        }
        dataChannel4.rv0(CaptionTypeChannel.class, str);
        C29305Ben c29305Ben = this.LJLLILLLL;
        if (c29305Ben != null) {
            if (this.LJLJI) {
                if (CCJ.LIZ(c29305Ben.getContext())) {
                    c29305Ben.setPadding((int) C87277YNd.LJIIJ(2), c29305Ben.getPaddingTop(), (int) C87277YNd.LJIIJ(6), c29305Ben.getPaddingBottom());
                } else {
                    c29305Ben.setPadding((int) C87277YNd.LJIIJ(6), c29305Ben.getPaddingTop(), (int) C87277YNd.LJIIJ(2), c29305Ben.getPaddingBottom());
                }
            } else if (CCJ.LIZ(c29305Ben.getContext())) {
                c29305Ben.setPadding((int) C87277YNd.LJIIJ(4), c29305Ben.getPaddingTop(), (int) C87277YNd.LJIIJ(6), c29305Ben.getPaddingBottom());
            } else {
                c29305Ben.setPadding((int) C87277YNd.LJIIJ(6), c29305Ben.getPaddingTop(), (int) C87277YNd.LJIIJ(4), c29305Ben.getPaddingBottom());
            }
        }
        LiveIconView liveIconView = this.LJLLJ;
        if (liveIconView != null) {
            if (this.LJLJI) {
                i = 0;
            } else {
                i = 8;
            }
            liveIconView.setVisibility(i);
        }
        Room room3 = this.LLFZ;
        if (room3 != null && (owner = room3.getOwner()) != null) {
            owner.getSecret();
        }
        View view = this.LJLJLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLZ.addAll(C47261Igj.LJJIJIIJI(this.LJLL, this.LJLLI));
        C29305Ben c29305Ben2 = this.LJLLILLLL;
        if (c29305Ben2 != null) {
            c29305Ben2.setDataChannel(this.dataChannel);
        }
        C29305Ben c29305Ben3 = this.LJLLILLLL;
        if (c29305Ben3 != null) {
            c29305Ben3.setVisibility(8);
        }
        Boolean LIZJ = InterfaceC30442Bx8.h1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_DRAG.value");
        if (LIZJ.booleanValue() && (c47121t6 = this.LJLLL) != null) {
            c47121t6.setVisibility(8);
        }
        TextView textView = this.LJLL;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            o.LJIIIIZZ(paint, "it.paint");
            float f = LLIIII - LLIIIILZ;
            DataChannel dataChannel5 = this.dataChannel;
            o.LJIIIIZZ(dataChannel5, "dataChannel");
            String captionLanguage2 = this.LLII;
            o.LJIIIIZZ(captionLanguage2, "captionLanguage");
            this.LJLLLLLL = new CaptionViewModel(paint, f, dataChannel5, captionLanguage2, this);
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.rv0(CaptionStartShowEvent.class, 0L);
        }
        this.dataChannel.lv0(this, CaptionDeleteEvent.class, new AqS171S0100000_5(this, 76));
        CaptionViewModel captionViewModel = this.LJLLLLLL;
        if (captionViewModel != null && (mutableLiveData = captionViewModel.LJLJJL) != null) {
            mutableLiveData.observe(this, new AObserverS73S0100000_5(this, 13));
        }
        this.dataChannel.lv0(this, CaptionTextTouchEvent.class, new AqS171S0100000_5(this, 77));
        this.dataChannel.ov0(this, CaptionStartShowEvent.class, new AqS171S0100000_5(this, 78));
        this.dataChannel.lv0(this, CaptionTextTouchMoveEvent.class, new AqS171S0100000_5(this, 79));
        this.dataChannel.lv0(this, CaptionStateChangeEvent.class, new AqS171S0100000_5(this, 80));
        this.dataChannel.lv0(this, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(this, 75));
        IMessageManager iMessageManager2 = this.LL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.RANK_UPDATE_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C0NB.LIZIZ("captiontextwidget", "ControlMessage");
        if (iMessage instanceof ControlMessage) {
            int i = ((ControlMessage) iMessage).action;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    LJZ("close");
                    return;
                } else {
                    this.LJLJJL = false;
                    LL();
                    return;
                }
            }
            this.LJLJJL = true;
            LL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJZL(X.C29296Bee r18, java.util.List<? extends android.widget.TextView> r19, X.InterfaceC67352kd<? super X.C76800UCe> r20) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget.LJZL(X.Bee, java.util.List, X.2kd):java.lang.Object");
    }
}
