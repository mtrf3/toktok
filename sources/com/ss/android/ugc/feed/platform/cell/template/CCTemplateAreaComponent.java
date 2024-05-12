package com.ss.android.ugc.feed.platform.cell.template;

import X.C188727au;
import X.C224868s6;
import X.C3C8;
import X.C51029K0z;
import X.C55511LqV;
import X.C65352Pkq;
import X.FMX;
import X.InterfaceC65350Pko;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CCTemplateAreaComponent extends BaseCellTriggerComponent<CCTemplateAreaComponent> {
    public final Map<Integer, View> LLF = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LLF;
        Integer valueOf = Integer.valueOf(R.id.view_rootview);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(R.id.view_rootview);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(CCTemplateAreaAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        o.LJIIIZ(item, "item");
        super.F0(item);
        if (C55511LqV.LJIIIIZZ(item.getAweme())) {
            return;
        }
        if (C224868s6.LIZLLL(item.getAweme())) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.view_rootview);
            if (_$_findCachedViewById != null && (findViewById4 = _$_findCachedViewById.findViewById(R.id.niu)) != null) {
                findViewById4.setVisibility(8);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.view_rootview);
            if (_$_findCachedViewById2 == null || (findViewById3 = _$_findCachedViewById2.findViewById(R.id.b7z)) == null) {
                return;
            }
            findViewById3.setVisibility(8);
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.view_rootview);
        if (_$_findCachedViewById3 != null && (findViewById2 = _$_findCachedViewById3.findViewById(R.id.niu)) != null) {
            findViewById2.setVisibility(0);
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.view_rootview);
        if (_$_findCachedViewById4 == null || (findViewById = _$_findCachedViewById4.findViewById(R.id.b7z)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (C224868s6.LIZLLL(item.getAweme())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        VideoItemParams videoItemParams;
        Aweme aweme2;
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        CCTemplateInfo ccTemplateInfo;
        String template_music_id;
        Music music;
        String idStr;
        CCTemplateInfo ccTemplateInfo2;
        CCTemplateInfo ccTemplateInfo3;
        CCTemplateInfo ccTemplateInfo4;
        if ((C224868s6.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || C224868s6.LIZJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) && (videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this)) != null && (aweme2 = videoItemParams.getAweme()) != null && aweme2.getCcTemplateInfo() != null) {
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
            String str5 = "";
            if (baseFeedPageParams == null || (str = baseFeedPageParams.getFromGroupId()) == null) {
                str = "";
            }
            BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
            if (baseFeedPageParams2 == null || (str2 = baseFeedPageParams2.getPreviousPage()) == null) {
                str2 = "";
            }
            Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            Context context = getContext();
            if (context == null) {
                return;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", str);
            if (aweme3 == null || (ccTemplateInfo4 = aweme3.getCcTemplateInfo()) == null || (str3 = ccTemplateInfo4.getTemplate_id()) == null) {
                str3 = "";
            }
            c188727au.LJIIIZ("template_id", str3);
            c188727au.LIZLLL(C224868s6.LIZIZ(context) ? 1 : 0, "is_install_lv");
            c188727au.LJIIIZ("enter_from", str2);
            String str6 = null;
            if (aweme3 != null && (ccTemplateInfo3 = aweme3.getCcTemplateInfo()) != null) {
                num = Integer.valueOf(ccTemplateInfo3.getTemplateOrder());
            } else {
                num = null;
            }
            c188727au.LJFF(num, "order");
            if (aweme3 == null || (ccTemplateInfo2 = aweme3.getCcTemplateInfo()) == null || (str4 = ccTemplateInfo2.getMatch_type()) == null) {
                str4 = "";
            }
            c188727au.LJIIIZ("match_type", str4);
            if (C224868s6.LIZJ(aweme3)) {
                if (aweme3 != null && (music = aweme3.getMusic()) != null && (idStr = music.getIdStr()) != null) {
                    str5 = idStr;
                }
                c188727au.LJI("music_id", str5);
                if (aweme3 != null) {
                    str6 = aweme3.getAid();
                }
                c188727au.LJI("match_item_id", str6);
            } else {
                if (aweme3 != null && (ccTemplateInfo = aweme3.getCcTemplateInfo()) != null && (template_music_id = ccTemplateInfo.getTemplate_music_id()) != null) {
                    str5 = template_music_id;
                }
                c188727au.LJI("music_id", str5);
            }
            FMX.LJIIL("cc_music_template_detail_page_show", c188727au.LIZ);
        }
    }
}
