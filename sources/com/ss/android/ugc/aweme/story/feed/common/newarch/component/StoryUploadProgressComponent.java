package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.AV1;
import X.C16880lQ;
import X.C17N;
import X.C1DH;
import X.C207668Da;
import X.C210248My;
import X.C210488Nw;
import X.C212428Vi;
import X.C214348b8;
import X.C221108m2;
import X.C221138m5;
import X.C221988nS;
import X.C222578oP;
import X.C222588oQ;
import X.C222928oy;
import X.C2304092m;
import X.C2MA;
import X.C31811Ce7;
import X.C32I;
import X.C41825GbF;
import X.C43921HLp;
import X.C47261Igj;
import X.C50420Jqa;
import X.C51029K0z;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C57432Nf;
import X.C5H3;
import X.C61878OQg;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C70012ov;
import X.EnumC221998nT;
import X.EnumC222138nh;
import X.InterfaceC72642tA;
import X.KR8;
import X.L1F;
import X.OSZ;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryUploadProgressComponent extends BaseCellSlotComponent<StoryUploadProgressComponent> implements Observer<C207668Da> {
    public int LLFII;
    public Aweme LLFZ;
    public final HashMap<String, Float> LLI;
    public final HashMap<String, EnumC221998nT> LLIFFJFJJ;
    public final C221138m5 LLII;
    public final C221138m5 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final StoryUploadProgressComponent$descExpandModeProtocol$1 LLIIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cpb;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryUploadProgressComponent$descExpandModeProtocol$1] */
    public StoryUploadProgressComponent() {
        new LinkedHashMap();
        this.LLFII = -1;
        this.LLI = new HashMap<>();
        this.LLIFFJFJJ = new HashMap<>();
        this.LLII = KR8.LJIIJJI(new AqS153S0100000_3(this, 920));
        this.LLIIII = KR8.LJIIJJI(new AqS153S0100000_3(this, 919));
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210488Nw.INSTANCE);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 921));
        this.LLIIIL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryUploadProgressComponent$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                StoryUploadProgressComponent storyUploadProgressComponent = StoryUploadProgressComponent.this;
                if (storyUploadProgressComponent.LLFFF == 0) {
                    storyUploadProgressComponent.Y3().setVisibility(0);
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        C210248My.LIZ.LIZLLL(this, "story_uploading_progress_bar", new AqS153S0100000_3(this, 918));
    }

    public final FeedCollectionViewPagerAbility u4() {
        return (FeedCollectionViewPagerAbility) this.LLII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIIIL));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C54838Lfe.LJJ(item.getAweme());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        Aweme aweme;
        String str2;
        String str3;
        Aweme item;
        C222928oy LJJLIIIJJIZ;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA;
        C2MA curViewHolder;
        Aweme aweme2;
        List<Aweme> list;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA2;
        C222928oy LJJLIIIJJIZ2;
        String authorUid;
        Aweme aweme3;
        String str4;
        String str5;
        int i;
        C207668Da c207668Da2 = c207668Da;
        Object obj = null;
        if (c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -208800987:
                if (!str.equals("UPLOADING_USER_STORY_ALL_SUCCESS") || C2304092m.LIZ()) {
                    return;
                }
                Object obj2 = c207668Da2.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                Integer cnt = (Integer) obj;
                o.LJIIIIZZ(cnt, "cnt");
                if (cnt.intValue() > 1) {
                    i = R.string.th_;
                } else {
                    i = R.string.rr5;
                }
                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                if (LIZLLL == null) {
                    return;
                }
                C31811Ce7.LIZJ(LIZLLL, i);
                return;
            case 271694622:
                if (!str.equals("UPLOADING_USER_STORY_FAIL")) {
                    return;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 == null) {
                    obj3 = null;
                }
                OSZ osz = (OSZ) obj3;
                String str6 = (String) osz.getFirst();
                String str7 = (String) osz.getSecond();
                HashMap<String, EnumC221998nT> hashMap = this.LLIFFJFJJ;
                EnumC221998nT enumC221998nT = EnumC221998nT.UPLOAD_FAIL;
                hashMap.put(str6, enumC221998nT);
                FeedCollectionViewPagerAbility u4 = u4();
                if (u4 == null) {
                    return;
                }
                int LLILL = u4.LLILL();
                FeedCollectionViewPagerAbility u42 = u4();
                if (u42 != null) {
                    aweme3 = u42.getItem(LLILL);
                } else {
                    aweme3 = null;
                }
                if (!C54838Lfe.LJIILL(aweme3)) {
                    return;
                }
                if (aweme3 != null) {
                    str4 = aweme3.getScheduleId();
                } else {
                    str4 = null;
                }
                if (!ujb.o.LJJJJIZL(str6, str4, true)) {
                    return;
                }
                C221988nS.LIZ(Y3(), enumC221998nT, 0.0f, str7);
                if (aweme3 != null) {
                    str5 = aweme3.getScheduleId();
                } else {
                    str5 = null;
                }
                Aweme aweme4 = this.LLFZ;
                if (aweme4 != null) {
                    obj = aweme4.getScheduleId();
                }
                if (o.LJ(obj, str5)) {
                    return;
                }
                C43921HLp.LIZ.getClass();
                C222578oP.LJIIJJI(C43921HLp.LJIILL(str5));
                return;
            case 1555587043:
                if (!str.equals("UPLOADING_USER_STORY_SUCCESS")) {
                    return;
                }
                Object obj4 = c207668Da2.LIZIZ;
                if (obj4 == null) {
                    obj4 = null;
                }
                OSZ osz2 = (OSZ) obj4;
                Object first = osz2.getFirst();
                Object second = osz2.getSecond();
                this.LLI.put(first, Float.valueOf(1.0f));
                this.LLIFFJFJJ.put(first, EnumC221998nT.UPLOAD_SUCCESS);
                FeedCollectionViewPagerAbility u43 = u4();
                if (u43 == null) {
                    return;
                }
                int LLILL2 = u43.LLILL();
                FeedCollectionViewPagerAbility u44 = u4();
                if (u44 != null) {
                    aweme2 = u44.getItem(LLILL2);
                } else {
                    aweme2 = null;
                }
                if (!C54838Lfe.LJIILL(aweme2) && (aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null || !ujb.o.LJJJJIZL(authorUid, AV1.LIZIZ().getUid(), true))) {
                    return;
                }
                FeedCollectionViewPagerAbility u45 = u4();
                if (u45 == null || (list = u45.Q8()) == null) {
                    list = C61878OQg.INSTANCE;
                }
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Aweme aweme5 : list) {
                        if (C54838Lfe.LJIILL(aweme5) && o.LJ(aweme5.getScheduleId(), first)) {
                            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                            for (Aweme aweme6 : list) {
                                if (C54838Lfe.LJIILL(aweme6) && o.LJ(aweme6.getScheduleId(), first)) {
                                    aweme6 = second;
                                }
                                arrayList.add(aweme6);
                            }
                            FeedCollectionViewPagerAbility u46 = u4();
                            if (u46 != null && (LJJLIIIJJIZ2 = u46.LJJLIIIJJIZ()) != null) {
                                LJJLIIIJJIZ2.setData(arrayList);
                            }
                            FeedCollectionViewPagerAbility u47 = u4();
                            if (u47 != null) {
                                int LLILL3 = u47.LLILL();
                                FeedCollectionViewPagerAbility u48 = u4();
                                if (u48 != null) {
                                    u48.e(LLILL3, false);
                                }
                            }
                            EnumC222138nh enumC222138nh = EnumC222138nh.ON_PUBLISH_SUCCESS;
                            C222588oQ c222588oQ = a1().LIZLLL;
                            if (c222588oQ == null || (interfaceC72642tA2 = c222588oQ.LIZIZ) == null) {
                                return;
                            }
                            interfaceC72642tA2.onInternalEvent(new C50420Jqa(60, new C57432Nf(enumC222138nh, null)));
                            return;
                        }
                    }
                }
                FeedCollectionViewPagerAbility u49 = u4();
                if (u49 == null) {
                    return;
                }
                u49.Hr0();
                return;
            case 2005298957:
                if (!str.equals("UPLOADING_LOCAL_VIDEO_READY")) {
                    return;
                }
                Object obj5 = c207668Da2.LIZIZ;
                if (obj5 != null) {
                    obj = obj5;
                }
                String str8 = (String) obj;
                FeedCollectionViewPagerAbility u410 = u4();
                if (u410 == null) {
                    return;
                }
                int LLILL4 = u410.LLILL();
                FeedCollectionViewPagerAbility u411 = u4();
                if (u411 == null || (item = u411.getItem(LLILL4)) == null || !C54838Lfe.LJIILL(item) || !ujb.o.LJJJJIZL(str8, item.getScheduleId(), true)) {
                    return;
                }
                FeedCollectionViewPagerAbility u412 = u4();
                if (u412 != null && (curViewHolder = u412.getCurViewHolder()) != null) {
                    curViewHolder.LLLZ(this.LLFII, item);
                }
                FeedCollectionViewPagerAbility u413 = u4();
                if (u413 == null || (LJJLIIIJJIZ = u413.LJJLIIIJJIZ()) == null) {
                    return;
                }
                int count = LJJLIIIJJIZ.getCount();
                EnumC222138nh enumC222138nh2 = EnumC222138nh.ON_PAGE_SELECTED;
                C70012ov c70012ov = new C70012ov(item, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).currentPosition, LLILL4, count, false, (Aweme) null, 96);
                C222588oQ c222588oQ2 = a1().LIZLLL;
                if (c222588oQ2 == null || (interfaceC72642tA = c222588oQ2.LIZIZ) == null) {
                    return;
                }
                interfaceC72642tA.onInternalEvent(new C50420Jqa(60, new C57432Nf(enumC222138nh2, c70012ov)));
                return;
            case 2025168429:
                if (!str.equals("UPLOADING_USER_STORY_PROGRESS")) {
                    return;
                }
                Object obj6 = c207668Da2.LIZIZ;
                if (obj6 == null) {
                    obj6 = null;
                }
                OSZ osz3 = (OSZ) obj6;
                String str9 = (String) osz3.getFirst();
                float floatValue = ((Number) osz3.getSecond()).floatValue();
                this.LLI.put(str9, Float.valueOf(floatValue));
                HashMap<String, EnumC221998nT> hashMap2 = this.LLIFFJFJJ;
                EnumC221998nT enumC221998nT2 = EnumC221998nT.UPLOADING;
                hashMap2.put(str9, enumC221998nT2);
                FeedCollectionViewPagerAbility u414 = u4();
                if (u414 == null) {
                    return;
                }
                int LLILL5 = u414.LLILL();
                FeedCollectionViewPagerAbility u415 = u4();
                if (u415 != null) {
                    aweme = u415.getItem(LLILL5);
                } else {
                    aweme = null;
                }
                if (C54838Lfe.LJIILIIL(aweme) && L1F.LIZIZ()) {
                    this.LLIFFJFJJ.put(str9, r4(floatValue, str9));
                }
                if (!C54838Lfe.LJIILL(aweme)) {
                    return;
                }
                if (aweme != null) {
                    str2 = aweme.getScheduleId();
                } else {
                    str2 = null;
                }
                if (!ujb.o.LJJJJIZL(str9, str2, true)) {
                    return;
                }
                if (C54838Lfe.LJIILIIL(aweme) && L1F.LIZIZ()) {
                    View Y3 = Y3();
                    if (aweme != null) {
                        str3 = aweme.getScheduleId();
                    } else {
                        str3 = null;
                    }
                    C221988nS.LIZ(Y3, r4(floatValue, str3), floatValue, null);
                    return;
                }
                C221988nS.LIZ(Y3(), enumC221998nT2, floatValue, null);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C17N.LJJIIJZLJL(Y3());
        C16880lQ.LJJJJI((TuxTextView) Y3().findViewById(R.id.izm), new ACListenerS23S0100000_3(this, 149));
        C16880lQ.LJJJ((TuxIconView) Y3().findViewById(R.id.nke), new ACListenerS23S0100000_3(this, 150));
        C16880lQ.LJIJ((RelativeLayout) Y3().findViewById(R.id.cnz), new ACListenerS23S0100000_3(this, 151));
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 93));
    }

    public final EnumC221998nT r4(float f, String str) {
        if (f >= 0.96f || str == null || !(!C41825GbF.LIZLLL.contains(str))) {
            return EnumC221998nT.ADDING_TO_STORY_NO_EDIT;
        }
        return EnumC221998nT.ADDING_TO_STORY;
    }
}
