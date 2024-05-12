package com.ss.android.ugc.aweme.story.service;

import X.AR6;
import X.ASL;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C00F;
import X.C210248My;
import X.C215178cT;
import X.C2304092m;
import X.C26224AQy;
import X.C2R7;
import X.C2U8;
import X.C41834GbO;
import X.C43921HLp;
import X.C4W0;
import X.C52867Kox;
import X.C53196KuG;
import X.C53578L1a;
import X.C54283LSd;
import X.C54284LSe;
import X.C54790Les;
import X.C54791Let;
import X.C54792Leu;
import X.C54794Lew;
import X.C54833LfZ;
import X.C54838Lfe;
import X.C55478Lpy;
import X.C55723Ltv;
import X.C56702Kk;
import X.C58096Mr6;
import X.GZP;
import X.HG3;
import X.HM1;
import X.InterfaceC182707Fa;
import X.InterfaceC184277Lb;
import X.InterfaceC222068na;
import X.InterfaceC54392LWi;
import X.InterfaceC54401LWr;
import X.InterfaceC54795Lex;
import X.InterfaceC54804Lf6;
import X.InterfaceC55036Liq;
import X.L1Y;
import X.L24;
import X.L26;
import X.L29;
import X.MFL;
import X.RBX;
import Y.IDCListenerS284S0100000_9;
import Y.IDDListenerS148S0100000_9;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.experiment.PreloadConfig;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS51S1200000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class StoryServiceImpl implements IStoryService {
    public int LIZ;

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LIZJ() {
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZJ) {
            C53578L1a.LIZIZ = C00F.LIZ(31744, 5, "tt_story_experiment", true);
        }
        if (((PreloadConfig) L26.LIZIZ.getValue()).coldStartOpt) {
            L29.LIZIZ.storeInt("story_bring_back_avatar_exp", ((Number) C53196KuG.LIZ.getValue()).intValue());
        }
    }

    public static IStoryService LJJI() {
        Object LIZ = C58096Mr6.LIZ(IStoryService.class, false);
        if (LIZ != null) {
            return (IStoryService) LIZ;
        }
        if (C58096Mr6.r7 == null) {
            synchronized (IStoryService.class) {
                if (C58096Mr6.r7 == null) {
                    C58096Mr6.r7 = new StoryServiceImpl();
                }
            }
        }
        return C58096Mr6.r7;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJ() {
        C53578L1a.LIZ.getClass();
        return C53578L1a.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJJI() {
        return ((Boolean) C2R7.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void clear() {
        C43921HLp.LIZ.getClass();
        C43921HLp.LJIJ().clear();
        ((ArrayList) C43921HLp.LJIIIIZZ).clear();
        C43921HLp.LJII = false;
        C43921HLp.LIZLLL.postValue(Boolean.FALSE);
        C54794Lew.LIZ.clear();
        ((LinkedHashMap) C54790Les.LIZIZ).clear();
        ((LinkedHashMap) C54790Les.LIZJ).clear();
        ((LinkedHashMap) C54790Les.LIZLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIJI() {
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableLightningPrivacySetting()) {
            C53578L1a.LIZ.getClass();
            if (C53578L1a.LIZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryInboxService LIZ() {
        return C54833LfZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final L24 LJ() {
        return L29.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final GZP LJII() {
        return C41834GbO.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC184277Lb LJIIIIZZ() {
        return C210248My.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC55036Liq LJIILIIL() {
        return C54790Les.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54401LWr LJIILJJIL() {
        return C43921HLp.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final MFL LJIILL() {
        return C54284LSe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC182707Fa LJIIZILJ() {
        return new InterfaceC182707Fa() { // from class: X.7cK
            @Override // X.InterfaceC182707Fa
            public final C189517cB LIZ(android.net.Uri uri) {
                List LJLJJL;
                String queryParameter;
                List LJLJJL2;
                o.LJIIIZ(uri, "uri");
                String queryParameter2 = UriProtector.getQueryParameter(uri, "story_insert_user_id_list");
                if (queryParameter2 == null || (LJLJJL = s.LJLJJL(queryParameter2, new String[]{","}, 0, 6)) == null || (queryParameter = UriProtector.getQueryParameter(uri, "story_insert_user_type_list")) == null || (LJLJJL2 = s.LJLJJL(queryParameter, new String[]{","}, 0, 6)) == null) {
                    return null;
                }
                return LIZLLL(LJLJJL, LJLJJL2);
            }

            @Override // X.InterfaceC182707Fa
            public final C189517cB LIZIZ(Intent intent) {
                Serializable serializableExtra = intent.getSerializableExtra("Story_insert_user_wrapper");
                if (serializableExtra != null) {
                    if (!(serializableExtra instanceof C189517cB)) {
                        return null;
                    }
                    return (C189517cB) serializableExtra;
                }
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "story_insert_user_id_list");
                if (LLJJIJIIJIL != null) {
                    List LJLJJL = s.LJLJJL(LLJJIJIIJIL, new String[]{","}, 0, 6);
                    String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "story_insert_user_type_list");
                    if (LLJJIJIIJIL2 != null) {
                        return LIZLLL(LJLJJL, s.LJLJJL(LLJJIJIIJIL2, new String[]{","}, 0, 6));
                    }
                }
                return null;
            }

            public static C189517cB LIZLLL(List list, List list2) {
                ArrayList arrayList = new ArrayList();
                int min = Math.min(list.size(), list2.size());
                for (int i = 0; i < min; i++) {
                    try {
                        C3C5.m7constructorimpl(Boolean.valueOf(arrayList.add(new StoryInsertUser(CastLongProtector.parseLong((String) ListProtector.get(list, i)), CastIntegerProtector.parseInt((String) ListProtector.get(list2, i))))));
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                }
                return new C189517cB(arrayList);
            }

            @Override // X.InterfaceC182707Fa
            public final AbstractC73672Svk LIZJ(long j, String aid) {
                o.LJIIIZ(aid, "aid");
                return StoryApi.LIZIZ.fetchStoryBulletList(aid, j, 20);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC222068na LJIJ() {
        return C215178cT.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54392LWi LJIJJ() {
        return C54792Leu.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54795Lex LJIL() {
        return C54794Lew.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int getTag() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Video LIZIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        return HM1.LIZJ(creationId);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJFF(int i) {
        this.LIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54804Lf6 LJIIIZ(Context context) {
        return new C54283LSd(context);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJ(String key) {
        o.LJIIIZ(key, "key");
        Set LIZ = HM1.LIZ();
        if (LIZ != null) {
            LIZ.remove(key);
        }
        HM1.LIZIZ().erase(key);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final AbstractC73672Svk<SwitchToStoryResponse> switchStoryToNormal(String str) {
        return StoryApi.LIZIZ.switchStoryToNormal(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LIZLLL(Context context, EnterStoryParam enterStoryParam) {
        boolean z;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterStoryParam, "enterStoryParam");
        if (enterStoryParam.getNeedPublishWithAnim() && !L1Y.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        AVExternalServiceImpl.LIZ().storyService().startStoryActivity(context, EnterStoryParam.copy$default(enterStoryParam, null, null, null, z, false, false, false, null, null, null, false, null, 4087, null));
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJI(Fragment fragment, Aweme aweme) {
        boolean z;
        String str;
        if (C2304092m.LIZ() && C54838Lfe.LJJI(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!C55723Ltv.LIZIZ.LJIJ().LJIJ(fragment)) {
            if (z) {
                if (((Number) C52867Kox.LIZ.getValue()).intValue() <= 0) {
                    IAccountUserService LJIILL = HG3.LJIILL();
                    if (aweme != null) {
                        str = aweme.getAuthorUid();
                    } else {
                        str = null;
                    }
                    if (((RBX) LJIILL).isMe(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIILLIIL(Video video, String str) {
        HM1.LIZLLL(video, str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJJLI(Aweme aweme, String aid) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
        ((Map) C55478Lpy.LJLJJL.getValue()).put(aid, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIL(ActivityC45651qj activityC45651qj, String enterFrom, Aweme aweme) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C43921HLp.LIZ.LIZIZ() && activityC45651qj != null) {
            C2U8.LIZ(new C56702Kk(1, activityC45651qj.hashCode()));
            String string = activityC45651qj.getString(R.string.dyu);
            o.LJIIIIZZ(string, "activity.getString(R.string.create_story_button)");
            C54791Let c54791Let = new C54791Let(string, new AqS51S1200000_9(activityC45651qj, enterFrom, aweme, 2), new AqS175S0100000_9(activityC45651qj, 649), 8);
            C26224AQy c26224AQy = new C26224AQy();
            c26224AQy.LIZJ = new AqS167S0100000_1(activityC45651qj, 542);
            c26224AQy.LIZLLL = 2;
            String string2 = activityC45651qj.getString(R.string.rt2);
            o.LJIIIIZZ(string2, "activity.getString(R.string.story_tutorial_title)");
            c26224AQy.LJ = string2;
            String string3 = activityC45651qj.getString(R.string.rt0);
            o.LJIIIIZZ(string3, "activity.getString(R.string.story_tutorial_desc1)");
            String string4 = activityC45651qj.getString(R.string.rt1);
            o.LJIIIIZZ(string4, "activity.getString(R.string.story_tutorial_desc2)");
            c26224AQy.LIZLLL(new AR6(R.raw.icon_camera, null, string3), new AR6(R.raw.icon_clock, null, string4));
            String str = c54791Let.LIZ;
            AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(c54791Let, 650);
            c26224AQy.LJII = str;
            c26224AQy.LJIIIZ = aqS175S0100000_9;
            ASL LIZ = c26224AQy.LIZ();
            IDDListenerS148S0100000_9 iDDListenerS148S0100000_9 = new IDDListenerS148S0100000_9(c54791Let, 8);
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLILLLLZI = iDDListenerS148S0100000_9;
            tuxSheet.LJLIL = new IDCListenerS284S0100000_9(c54791Let, 5);
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "STORY_EDUCATION_PANEL");
            SpecActServiceImpl.LJJJIL().LJIJI(true);
            C4W0.LIZ(enterFrom, aweme, "show");
        }
    }
}
