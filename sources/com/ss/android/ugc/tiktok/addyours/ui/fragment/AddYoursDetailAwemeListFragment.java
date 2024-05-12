package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.AbstractC51036K1g;
import X.C0A2;
import X.C17N;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C219208iy;
import X.C219248j2;
import X.C220248ke;
import X.C220368kq;
import X.C220378kr;
import X.C221118m3;
import X.C26338AVi;
import X.C55480Lq0;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BD;
import X.C9BE;
import X.InterfaceC223218pR;
import X.MGV;
import X.MGX;
import X.QD3;
import Y.IDcS35S0100000_3;
import Y.IDrS43S0100000_3;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS58S1200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursDetailAwemeListFragment extends DetailAwemeListFragment {
    public final C214298b3 LLILLL;
    public final float LLILZ;
    public AddYoursTopic LLILZIL;
    public final C5H3 LLILZLL;
    public final C5H3 LLIZ;
    public final Map<Integer, View> LLIZLLLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIZLLLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initData() {
        C220378kr c220378kr;
        C220368kq presenter$addyours_release;
        this.LLIIJI = true;
        super.initData();
        MGV mgv = this.LLILLIZIL;
        if ((mgv instanceof C220378kr) && (c220378kr = (C220378kr) mgv) != null && (presenter$addyours_release = c220378kr.getPresenter$addyours_release()) != null) {
            ((InterfaceC223218pR) presenter$addyours_release.LJLILLLLZI).J5(((AbstractC51036K1g) presenter$addyours_release.LJLIL).getItems(), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public AddYoursDetailAwemeListFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursDetailViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1448);
        C220248ke c220248ke = C220248ke.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c220248ke, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c220248ke, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLL = c214298b3;
        this.LLILZ = C17N.LJIJJLI(100);
        this.LLILZLL = C221118m3.LIZ(new AqS58S1200000_3(this, "from_aweme", (Object) null, 2));
        this.LLIZ = C221118m3.LIZ(new AqS58S1200000_3(this, "detail_aweme_from", (Object) null, 3));
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C55480Lq0.LIZIZ.LIZLLL(249372161, 3);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void Pl(C0A2 c0a2) {
        GridLayoutManager gridLayoutManager;
        if (!(c0a2 instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) c0a2) == null) {
            return;
        }
        gridLayoutManager.LLJLILLLLZIIL(new IDcS35S0100000_3(this, 0));
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initArguments(Bundle bundle) {
        Serializable serializable;
        super.initArguments(bundle);
        AddYoursTopic addYoursTopic = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("topic");
        } else {
            serializable = null;
        }
        if (serializable instanceof AddYoursTopic) {
            addYoursTopic = (AddYoursTopic) serializable;
        }
        this.LLILZIL = addYoursTopic;
    }

    @QD3
    public final void onTopicUpdated(C219248j2 event) {
        C220378kr c220378kr;
        o.LJIIIZ(event, "event");
        Long topicId = event.LJLIL.getTopicId();
        AddYoursTopic addYoursTopic = this.LLILZIL;
        Long l = null;
        if (addYoursTopic != null) {
            l = addYoursTopic.getTopicId();
        }
        if (o.LJ(topicId, l)) {
            AddYoursTopic addYoursTopic2 = event.LJLIL;
            this.LLILZIL = addYoursTopic2;
            MGV mgv = this.LLILLIZIL;
            if ((mgv instanceof C220378kr) && (c220378kr = (C220378kr) mgv) != null) {
                c220378kr.updateTopic(addYoursTopic2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView listView = this.LJZ;
        o.LJIIIIZZ(listView, "listView");
        C26338AVi.LJIIIZ(listView, null, null, null, Integer.valueOf((int) C17N.LJIJJLI(85)), 23);
        this.LJZ.LJIIJJI(new IDrS43S0100000_3(this, 10));
        C55480Lq0.LIZIZ.LIZLLL(249372161, 2);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        String str;
        SmartRoute route = super.wl(mgx, aweme);
        AddYoursTopic addYoursTopic = this.LLILZIL;
        if (addYoursTopic != null) {
            route.withParam("question_content", addYoursTopic.getText());
            route.withParam("show_add_yours_button", 1);
            route.withParam("video_from", "add_yours");
            route.withParam("enter_from", "add_yours_detail_page");
            Aweme aweme2 = (Aweme) this.LLILZLL.getValue();
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            route.withParam("from_group_id", str);
        }
        o.LJIIIIZZ(route, "route");
        return route;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void LLLILZ(View view, Aweme aweme, String str) {
        String str2;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, "aid_fake_topic_header") && o.LJ(str, "click_invite")) {
            AddYoursTopic addYoursTopic = this.LLILZIL;
            if (addYoursTopic == null) {
                return;
            }
            C219208iy c219208iy = C219208iy.LIZIZ;
            c219208iy.LIZJ(mo49getActivity(), c219208iy.LIZIZ(), new AqS134S0200000_3(addYoursTopic, this, BuildConfig.VERSION_CODE));
            return;
        }
        super.LLLILZ(view, aweme, str);
    }
}
