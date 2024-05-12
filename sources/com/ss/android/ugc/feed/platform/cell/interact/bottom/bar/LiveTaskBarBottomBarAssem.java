package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.ActivityC45651qj;
import X.C025908h;
import X.C16880lQ;
import X.C199097rd;
import X.C2055284u;
import X.C2QO;
import X.C36782Ec6;
import X.C40084FoG;
import X.C47699Inn;
import X.C72818Shy;
import X.C73969T1h;
import X.C76052yf;
import X.C78528Urs;
import X.C78596Usy;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.JIK;
import X.QD3;
import X.T16;
import X.X1D;
import Y.ACListenerS43S0200000_8;
import Y.AfS47S0300000_8;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.api.LiveTaskApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class LiveTaskBarBottomBarAssem extends BaseCellSlotComponent<LiveTaskBarBottomBarAssem> implements InterfaceC72822Si2 {
    public ConstraintLayout LLFII;
    public Aweme LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public int LLIIII;
    public int LLIIIILZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.adi;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void c4() {
        this.LLI = true;
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void e4() {
        this.LLI = false;
        this.LLIFFJFJJ = false;
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    public LiveTaskBarBottomBarAssem() {
        new LinkedHashMap();
        this.LLIIII = -1;
        this.LLIIIILZ = -1;
        C72818Shy.LIZLLL("LiveAcademyTaskPanelEvent", this);
        C72818Shy.LIZLLL("LiveAcademyTaskGoLiveFromPreviewPage", this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        int i;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFZ = item.getAweme();
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        Aweme aweme2 = item.getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        String str = item.mEventType;
        o.LJIIIIZZ(str, "item.eventType");
        if (C78596Usy.LJJJJIZL(aweme2, str)) {
            ConstraintLayout constraintLayout = this.LLFII;
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS43S0200000_8(this, aweme, 18));
            }
            Integer num = JIK.LIZLLL;
            int i2 = -1;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            this.LLIIII = i;
            Integer num2 = JIK.LJ;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            this.LLIIIILZ = i2;
            if (q4(aweme)) {
                C47699Inn.LJFF(aweme, true);
                return;
            }
            return;
        }
        C72818Shy.LJII("LiveAcademyTaskPanelEvent", this);
        C72818Shy.LJII("LiveAcademyTaskGoLiveFromPreviewPage", this);
        ConstraintLayout constraintLayout2 = this.LLFII;
        if (constraintLayout2 == null) {
            return;
        }
        constraintLayout2.setVisibility(8);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Activity activity;
        String str = c199097rd.LJLIL;
        if (o.LJ(str, "LiveAcademyTaskPanelEvent")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                String string = interfaceC78280Uns.getString("status");
                if (o.LJ(string, "close")) {
                    this.LLIFFJFJJ = false;
                    return;
                } else {
                    if (!o.LJ(string, "open")) {
                        return;
                    }
                    this.LLIFFJFJJ = true;
                    return;
                }
            }
            return;
        }
        if (!o.LJ(str, "LiveAcademyTaskGoLiveFromPreviewPage")) {
            return;
        }
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(new JSONObject()), "close_front_page_in_livePreviewPage"));
        Context context = getContext();
        if (!(context instanceof Activity) || (activity = (Activity) context) == null || !o.LJ("com.ss.android.ugc.aweme.detail.ui.DetailActivity", C16880lQ.LJLLILLLL(activity.getClass()))) {
            return;
        }
        activity.finish();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowTasks(C2QO event) {
        String str;
        o.LJIIIZ(event, "event");
        Aweme aweme = event.LJLIL;
        if (aweme != null) {
            String aid = aweme.getAid();
            Aweme aweme2 = this.LLFZ;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            if (o.LJ(aid, str) && event.LJLILLLLZI >= 90.0f) {
                this.LLII = true;
                Aweme aweme3 = event.LJLIL;
                if (aweme3 == null || !this.LLI || aweme3.getAid() == null) {
                    return;
                }
                String aid2 = aweme3.getAid();
                o.LJIIIIZZ(aid2, "awemeTmp.aid");
                HashMap hashMap = (HashMap) C47699Inn.LJIIJ;
                Object obj = hashMap.get(aid2);
                Boolean bool = Boolean.TRUE;
                if (o.LJ(obj, bool) || !this.LLII || !(getContext() instanceof ActivityC45651qj)) {
                    return;
                }
                this.LLII = false;
                if (TextUtils.isEmpty(aweme3.getAid())) {
                    return;
                }
                String aid3 = aweme3.getAid();
                o.LJIIIIZZ(aid3, "awemeTmp.aid");
                hashMap.put(aid3, bool);
                String aid4 = aweme3.getAid();
                o.LJIIIIZZ(aid4, "awemeTmp.aid");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("https://");
                LiveOuterService.LJJJLL().LJJIJIL().getClass();
                LIZ.append(Live.getLiveDomain());
                ((LiveTaskApi.RealApi) C40084FoG.LIZIZ(X1D.LIZIZ(LIZ)).LIZ.LIZ(LiveTaskApi.RealApi.class)).finishTask(aid4, 1).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS47S0300000_8(this, aweme3, aweme3, 1), C36782Ec6.LJLIL);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ConstraintLayout) view.findViewById(R.id.bpx);
        C2055284u.LIZJ((TuxTextView) view.findViewById(R.id.fzr), null);
    }

    public final boolean q4(Aweme aweme) {
        TuxTextView tuxTextView;
        Resources resources;
        Resources resources2;
        Resources resources3;
        String string;
        if (getContext() == null) {
            return false;
        }
        ConstraintLayout constraintLayout = this.LLFII;
        String str = null;
        if (constraintLayout != null) {
            tuxTextView = (TuxTextView) constraintLayout.findViewById(R.id.fzr);
        } else {
            tuxTextView = null;
        }
        if (this.LLIIII < 0 || this.LLIIIILZ <= 0) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            int LIZIZ = C47699Inn.LIZIZ(aid);
            if (LIZIZ != 0) {
                if (LIZIZ == 1 && tuxTextView != null) {
                    Context context = getContext();
                    if (context != null && (resources2 = context.getResources()) != null) {
                        str = resources2.getString(R.string.n69);
                    }
                    tuxTextView.setText(str);
                }
            } else if (tuxTextView != null) {
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    str = resources.getString(R.string.n66);
                }
                tuxTextView.setText(str);
            }
            return false;
        }
        if (tuxTextView != null) {
            Context context3 = getContext();
            if (context3 == null || (resources3 = context3.getResources()) == null || (string = resources3.getString(R.string.n6k, Integer.valueOf(this.LLIIII), Integer.valueOf(this.LLIIIILZ))) == null) {
                return false;
            }
            C025908h.LJ(new Object[0], 0, string, "format(format, *args)", tuxTextView);
        }
        ConstraintLayout constraintLayout2 = this.LLFII;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
        return true;
    }
}
