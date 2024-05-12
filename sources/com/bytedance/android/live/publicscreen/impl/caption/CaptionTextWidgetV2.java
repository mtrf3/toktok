package com.bytedance.android.live.publicscreen.impl.caption;

import X.AbstractC019505v;
import X.AnonymousClass391;
import X.BZI;
import X.C018905p;
import X.C135365Sy;
import X.C28787BRn;
import X.C29295Bed;
import X.C29305Ben;
import X.C29927Bop;
import X.C2A4;
import X.C30167Bsh;
import X.C47121t6;
import X.C47261Igj;
import X.C77090UNi;
import X.C77103UNv;
import X.C792439c;
import X.C87277YNd;
import X.CCJ;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC30442Bx8;
import X.KL2;
import X.O6R;
import X.UO1;
import X.UOA;
import X.UOB;
import X.UOC;
import X.UOE;
import X.UOF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionLayoutManager;
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
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CaptionTextWidgetV2 extends LiveRecyclableWidget implements OnMessageListener {
    public static final float LLIIIL = C87277YNd.LJIIJ(211);
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public volatile boolean LJLJLLL = true;
    public View LJLL;
    public C47121t6 LJLLI;
    public C29305Ben LJLLILLLL;
    public C47121t6 LJLLJ;
    public LiveIconView LJLLL;
    public ConstraintLayout LJLLLL;
    public C47121t6 LJLLLLLL;
    public C2A4 LJLZ;
    public C135365Sy LJZ;
    public IMessageManager LJZI;
    public long LJZL;
    public long LL;
    public long LLD;
    public Room LLF;
    public C77103UNv LLFF;
    public CaptionInfo LLFFF;
    public C29295Bed LLFII;
    public UO1 LLFZ;
    public UOE LLI;
    public UOC LLIFFJFJJ;
    public UOB LLII;
    public final String LLIIII;
    public String LLIIIILZ;
    public final UOF LLIIIJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        C2A4 c2a4 = this.LJLZ;
        if (c2a4 != null) {
            if (c2a4.LJFF()) {
                c2a4.LJ();
            }
            KL2.LJIILLIIL(4, c2a4);
        }
    }

    public final void LJZ() {
        DataChannel dataChannel;
        Long l = (Long) this.dataChannel.kv0(CaptionStartShowEvent.class);
        if ((l == null || l.longValue() == 0) && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(CaptionStartShowEvent.class, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        C29295Bed c29295Bed = this.LLFII;
        if (c29295Bed != null) {
            boolean z = this.LJLJLLL;
            AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 172);
            if (z) {
                aqS163S0100000_13.invoke();
                BZI LIZ = C28787BRn.LIZ("livesdk_audience_caption_start");
                LIZ.LJIILLIIL(c29295Bed.LIZ);
                LIZ.LJJIFFI(c29295Bed.LIZ());
                LIZ.LJJIIJZLJL();
            }
        }
        KL2.LJIILLIIL(0, this.LJLLILLLL);
        KL2.LJIILLIIL(8, this.LJLLLLLL);
        LJLZ();
        KL2.LJIILLIIL(0, this.LJZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveRecycleWidgetV3Setting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C29295Bed c29295Bed;
        ((IInteractService) CN1.LIZ(IInteractService.class)).Fe(this.LLIIIJ);
        IMessageManager iMessageManager = this.LJZI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (LIZJ.booleanValue() && (c29295Bed = this.LLFII) != null) {
            c29295Bed.LIZIZ("leave", this.LLD, this.LJLJJI, new AqS163S0100000_13(this, 174));
        }
        LJLZ();
        this.LLFFF = null;
        InterfaceC30442Bx8.j1.LIZ(Boolean.FALSE);
    }

    public CaptionTextWidgetV2() {
        String language = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
        this.LLIIII = language;
        this.LLIIIILZ = language;
        this.LLIIIJ = new UOF(this);
    }

    public final void LJZI(boolean z) {
        UO1 uo1;
        if (!this.LJLJJL && !this.LJLJI) {
            Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
            if (LIZJ.booleanValue() && ((!z || ((uo1 = this.LLFZ) != null && uo1.LJIIIIZZ)) && !this.LJLJL && !InterfaceC30442Bx8.j1.LIZJ().booleanValue())) {
                show();
                return;
            }
        }
        LJLZ();
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLLILLLL = (C29305Ben) findViewById(R.id.l4m);
        this.LJLLJ = (C47121t6) findViewById(R.id.cgy);
        this.LJZ = (C135365Sy) findViewById(R.id.b5a);
        this.LJLLI = (C47121t6) findViewById(R.id.l4b);
        this.LJLLLL = (ConstraintLayout) findViewById(R.id.l4w);
        this.LJLL = findViewById(R.id.b4o);
        this.LJLLL = (LiveIconView) findViewById(R.id.lk2);
        this.LJLLLLLL = (C47121t6) findViewById(R.id.b59);
        this.LJLZ = (C2A4) findViewById(R.id.b56);
        AbstractC019505v abstractC019505v = (AbstractC019505v) findViewById(R.id.agt);
        if (abstractC019505v == null) {
            return;
        }
        abstractC019505v.setReferencedIds(new int[]{R.id.b55, R.id.cgy});
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Room room;
        CaptionInfo captionInfo;
        int i;
        long j;
        long j2;
        String str;
        int i2;
        C135365Sy c135365Sy;
        C47121t6 c47121t6;
        List<String> list;
        User owner;
        CaptionInfo captionInfo2;
        this.LJLIL = false;
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLJLLL = true;
        InterfaceC30442Bx8.j1.LIZ(Boolean.FALSE);
        DataChannel dataChannel = this.dataChannel;
        ViewGroup.LayoutParams layoutParams = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJZI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.CONTROL.getIntType(), this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLF = room;
        if (room != null) {
            captionInfo = room.captionInfo;
        } else {
            captionInfo = null;
        }
        this.LLFFF = captionInfo;
        if (room != null && (captionInfo2 = room.captionInfo) != null) {
            i = captionInfo2.location;
        } else {
            i = 1;
        }
        if (i == 2) {
            C29305Ben c29305Ben = this.LJLLILLLL;
            if (c29305Ben != null) {
                layoutParams = c29305Ben.getLayoutParams();
            }
            if (layoutParams instanceof C018905p) {
                C018905p c018905p = (C018905p) layoutParams;
                c018905p.startToStart = R.id.l4w;
                c018905p.bottomToBottom = R.id.l4w;
                c018905p.topToTop = -1;
                c018905p.endToEnd = -1;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = AnonymousClass391.LIZ(1.5d);
                c018905p.setMarginEnd(O6R.LJJIIZ(C87277YNd.LJIIJ(0)));
                c018905p.setMarginStart(O6R.LJJIIZ(C87277YNd.LJIIJ(12)));
                C29305Ben c29305Ben2 = this.LJLLILLLL;
                if (c29305Ben2 != null) {
                    c29305Ben2.setLayoutParams(layoutParams);
                }
            }
        }
        Room room2 = this.LLF;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.LJZL = j;
        Room room3 = this.LLF;
        if (room3 != null && (owner = room3.getOwner()) != null) {
            j2 = owner.getId();
        } else {
            j2 = 0;
        }
        this.LL = j2;
        CaptionInfo captionInfo3 = this.LLFFF;
        if (captionInfo3 != null && (list = captionInfo3.supportLang) != null && (!list.isEmpty())) {
            if (list.contains(this.LLIIII)) {
                this.LLIIIILZ = this.LLIIII;
                this.LJLILLLLZI = !o.LJ(ListProtector.get(list, 0), this.LLIIII);
            } else {
                this.LLIIIILZ = (String) ListProtector.get(list, 0);
                this.LJLILLLLZI = false;
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        o.LJIIIIZZ(dataChannel3, "dataChannel");
        String valueOf = String.valueOf(this.LL);
        String valueOf2 = String.valueOf(this.LJZL);
        String language = this.LLIIII;
        o.LJIIIIZZ(language, "language");
        String captionLanguage = this.LLIIIILZ;
        o.LJIIIIZZ(captionLanguage, "captionLanguage");
        String str2 = "translational";
        if (this.LJLILLLLZI) {
            str = "translational";
        } else {
            str = "original";
        }
        this.LLFII = new C29295Bed(dataChannel3, valueOf, valueOf2, language, captionLanguage, str);
        ((IInteractService) CN1.LIZ(IInteractService.class)).Js0(this.LLIIIJ);
        DataChannel dataChannel4 = this.dataChannel;
        String captionLanguage2 = this.LLIIIILZ;
        o.LJIIIIZZ(captionLanguage2, "captionLanguage");
        dataChannel4.rv0(CaptionLanguageChannel.class, captionLanguage2);
        DataChannel dataChannel5 = this.dataChannel;
        if (!this.LJLILLLLZI) {
            str2 = "original";
        }
        dataChannel5.rv0(CaptionTypeChannel.class, str2);
        C29305Ben c29305Ben3 = this.LJLLILLLL;
        if (c29305Ben3 != null) {
            if (this.LJLILLLLZI) {
                if (CCJ.LIZ(c29305Ben3.getContext())) {
                    c29305Ben3.setPadding((int) C87277YNd.LJIIJ(2), c29305Ben3.getPaddingTop(), (int) C87277YNd.LJIIJ(6), c29305Ben3.getPaddingBottom());
                } else {
                    c29305Ben3.setPadding((int) C87277YNd.LJIIJ(6), c29305Ben3.getPaddingTop(), (int) C87277YNd.LJIIJ(2), c29305Ben3.getPaddingBottom());
                }
            } else if (CCJ.LIZ(c29305Ben3.getContext())) {
                c29305Ben3.setPadding((int) C87277YNd.LJIIJ(4), c29305Ben3.getPaddingTop(), (int) C87277YNd.LJIIJ(6), c29305Ben3.getPaddingBottom());
            } else {
                c29305Ben3.setPadding((int) C87277YNd.LJIIJ(6), c29305Ben3.getPaddingTop(), (int) C87277YNd.LJIIJ(4), c29305Ben3.getPaddingBottom());
            }
        }
        LiveIconView liveIconView = this.LJLLL;
        if (this.LJLILLLLZI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        KL2.LJIILLIIL(i2, liveIconView);
        KL2.LJIILLIIL(8, this.LJLL);
        C29305Ben c29305Ben4 = this.LJLLILLLL;
        if (c29305Ben4 != null) {
            c29305Ben4.setDataChannel(this.dataChannel);
        }
        Boolean LIZJ = InterfaceC30442Bx8.h1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_DRAG.value");
        if (LIZJ.booleanValue() && (c47121t6 = this.LJLLJ) != null) {
            c47121t6.setVisibility(8);
        }
        C792439c c792439c = new C792439c();
        UOE uoe = new UOE(new AqS163S0100000_13(this, 371));
        ((ArrayList) c792439c.LJ).add(uoe);
        this.LLI = uoe;
        this.LLIFFJFJJ = new UOC(this.LJLLLLLL, this.LJLZ, this.LJZ, new AqS163S0100000_13(this, 372));
        C47121t6 c47121t62 = this.LJLLI;
        if (c47121t62 != null && (c135365Sy = this.LJZ) != null) {
            TextPaint paint = c47121t62.getPaint();
            o.LJIIIIZZ(paint, "liveTextView.paint");
            UO1 uo1 = new UO1(c792439c, paint, LLIIIL, new AqS179S0100000_13(this, 420), new AqS160S0200000_13(this, c792439c, 30), this);
            C77103UNv c77103UNv = new C77103UNv(uo1, this, new C30167Bsh(this));
            this.LLFF = c77103UNv;
            C135365Sy c135365Sy2 = this.LJZ;
            if (c135365Sy2 != null) {
                c135365Sy2.setAdapter(c77103UNv);
            }
            C135365Sy c135365Sy3 = this.LJZ;
            if (c135365Sy3 != null) {
                c135365Sy3.setLayoutManager(new CaptionLayoutManager());
            }
            UOB uob = new UOB(c135365Sy, this.LLFF, new UOA(this, c792439c), C47261Igj.LJJIJIIJI(this.LLIFFJFJJ, this.LLI), uo1);
            this.LLII = uob;
            uo1.LJIIIZ = uob;
            uob.LIZLLL(uo1.LJIIL);
            DataChannel dataChannel6 = this.dataChannel;
            o.LJIIIIZZ(dataChannel6, "dataChannel");
            String captionLanguage3 = this.LLIIIILZ;
            o.LJIIIIZZ(captionLanguage3, "captionLanguage");
            new C77090UNi(dataChannel6, captionLanguage3, this, uo1, new AqS179S0100000_13(this, 421));
            this.LLFZ = uo1;
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            dataChannel7.rv0(CaptionStartShowEvent.class, 0L);
        }
        this.dataChannel.lv0(this, CaptionDeleteEvent.class, new AqS179S0100000_13(this, 262));
        this.dataChannel.lv0(this, CaptionTextTouchEvent.class, new AqS179S0100000_13(this, 263));
        this.dataChannel.ov0(this, CaptionStartShowEvent.class, new AqS179S0100000_13(this, 264));
        this.dataChannel.lv0(this, CaptionTextTouchMoveEvent.class, new AqS171S0100000_5(this, 81));
        this.dataChannel.lv0(this, CaptionStateChangeEvent.class, new AqS179S0100000_13(this, 265));
        this.dataChannel.lv0(this, LinkCrossRoomStateChangeEvent.class, new AqS179S0100000_13(this, 266));
        LJZI(true);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C29295Bed c29295Bed;
        if (iMessage instanceof ControlMessage) {
            int i = ((ControlMessage) iMessage).action;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 || (c29295Bed = this.LLFII) == null) {
                        return;
                    }
                    c29295Bed.LIZIZ("close", this.LLD, this.LJLJJI, new AqS163S0100000_13(this, 173));
                    return;
                }
                this.LJLJI = false;
                UO1 uo1 = this.LLFZ;
                if (uo1 != null) {
                    uo1.LJIIIIZZ = false;
                }
                LJZI(true);
                return;
            }
            this.LJLJI = true;
            UO1 uo12 = this.LLFZ;
            if (uo12 != null) {
                uo12.LJIIIIZZ = false;
            }
            LJZI(true);
        }
    }
}
