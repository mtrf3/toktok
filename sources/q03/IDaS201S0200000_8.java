package q03;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C020506f;
import X.C1AT;
import X.C1DG;
import X.C212428Vi;
import X.C42422Gks;
import X.C48881JGj;
import X.C48887JGp;
import X.C49024JLw;
import X.C50082Jl8;
import X.C50651JuJ;
import X.C50652JuK;
import X.C55096Ljo;
import X.C98T;
import X.EnumC50080Jl6;
import X.FMX;
import X.FT5;
import X.JN1;
import X.K76;
import X.SY4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoSugAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoVideoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ui.SearchCreationEntranceAssem;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDaS201S0200000_8 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDaS201S0200000_8 iDaS201S0200000_8, View view) {
        SearchTakoCardAbility searchTakoCardAbility;
        if (view != null && (searchTakoCardAbility = (SearchTakoCardAbility) ((SearchTakoSugAssem) iDaS201S0200000_8.l0).LLFF.getValue()) != null) {
            searchTakoCardAbility.Xq0((JN1) iDaS201S0200000_8.l1);
        }
    }

    public static final void LIZ$1(IDaS201S0200000_8 iDaS201S0200000_8, View view) {
        if (view != null) {
            Object value = ((SearchTakoVideoRootAssem) iDaS201S0200000_8.l0).LLFFF.getValue();
            o.LJIIIIZZ(value, "<get-videoView>(...)");
            C48881JGj dataProvider = ((C48887JGp) value).getDataProvider();
            C1AT LIZIZ = C020506f.LIZIZ(view, view.getWidth() / 2, view.getHeight() / 2);
            SearchTakoCardAbility searchTakoCardAbility = (SearchTakoCardAbility) ((SearchTakoVideoRootAssem) iDaS201S0200000_8.l0).LLFF.getValue();
            if (searchTakoCardAbility != null) {
                searchTakoCardAbility.Tu0((C49024JLw) iDaS201S0200000_8.l1, dataProvider, LIZIZ);
            }
            SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((SearchTakoVideoRootAssem) iDaS201S0200000_8.l0), SearchServiceCenter$MobAbility.class, null);
            if (searchServiceCenter$MobAbility != null) {
                searchServiceCenter$MobAbility.hH((C49024JLw) iDaS201S0200000_8.l1);
            }
            HashMap LIZ = ((C49024JLw) iDaS201S0200000_8.l1).LJLJI.LIZ();
            String groupId = ((C49024JLw) iDaS201S0200000_8.l1).LJLILLLLZI.getGroupId();
            String str = "";
            if (groupId == null) {
                groupId = "";
            }
            LIZ.put("group_id", groupId);
            String authorUid = ((C49024JLw) iDaS201S0200000_8.l1).LJLILLLLZI.getAuthorUid();
            if (authorUid != null) {
                str = authorUid;
            }
            LIZ.put("author_id", str);
            FMX.LJIIL("feed_enter", LIZ);
        }
    }

    public static final void LIZ$2(IDaS201S0200000_8 iDaS201S0200000_8, View view) {
        if (view != null) {
            SearchCreationEntranceAssem searchCreationEntranceAssem = (SearchCreationEntranceAssem) iDaS201S0200000_8.l0;
            Context context = ((View) iDaS201S0200000_8.l1).getContext();
            o.LJIIIIZZ(context, "view.context");
            searchCreationEntranceAssem.getClass();
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            Fragment LIZLLL = C212428Vi.LIZLLL(searchCreationEntranceAssem);
            c50651JuJ.getClass();
            SearchCreationExtraData I3 = searchCreationEntranceAssem.I3(EnumC50080Jl6.SHOOT, C50651JuJ.LJ(LIZLLL));
            String LIZ = C50082Jl8.LIZ(I3.getMobMap());
            searchCreationEntranceAssem.K3(LIZ);
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.creationId(LIZ);
            builder.shootWay("hashtag_search");
            builder.enterFrom("general_search");
            builder.enterMethod("");
            builder.fromMain(false);
            builder.startRecordTime(System.currentTimeMillis());
            builder.translationType(3);
            builder.shootExtraData(new ShootExtraData("search_page", null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            builder.searchCreationExtra(I3);
            AVExternalServiceImpl.LIZ().asyncService("direct_shoot", new IDLCallbackS16S0200000_7(context, builder, 17));
            ((SearchCreationEntranceAssem) iDaS201S0200000_8.l0).H3();
        }
    }

    public static final void LIZ$3(IDaS201S0200000_8 iDaS201S0200000_8, View view) {
        Activity LIZ;
        if (view != null && (LIZ = FT5.LIZ((View) iDaS201S0200000_8.l0, "view.context")) != null) {
            SearchCreationEntranceAssem searchCreationEntranceAssem = (SearchCreationEntranceAssem) iDaS201S0200000_8.l1;
            searchCreationEntranceAssem.getClass();
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            Fragment LIZLLL = C212428Vi.LIZLLL(searchCreationEntranceAssem);
            c50651JuJ.getClass();
            SearchCreationExtraData I3 = searchCreationEntranceAssem.I3(EnumC50080Jl6.ALBUM, C50651JuJ.LJ(LIZLLL));
            String LIZ2 = C50082Jl8.LIZ(I3.getMobMap());
            searchCreationEntranceAssem.K3(LIZ2);
            AVExternalServiceImpl.LIZ().asyncService("direct_shoot", new C42422Gks(LIZ, LIZ2, I3));
            ((SearchCreationEntranceAssem) iDaS201S0200000_8.l1).H3();
        }
    }

    public static final void LIZ$4(IDaS201S0200000_8 iDaS201S0200000_8, View view) {
        ActivityC45651qj LJ;
        if (view != null && (LJ = C1DG.LJ((View) iDaS201S0200000_8.l0, "view.context")) != null) {
            SearchCreationEntranceAssem searchCreationEntranceAssem = (SearchCreationEntranceAssem) iDaS201S0200000_8.l1;
            searchCreationEntranceAssem.getClass();
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            Fragment LIZLLL = C212428Vi.LIZLLL(searchCreationEntranceAssem);
            c50651JuJ.getClass();
            SearchCreationExtraData I3 = searchCreationEntranceAssem.I3(EnumC50080Jl6.TEXTMODE, C50651JuJ.LJ(LIZLLL));
            String LIZ = C50082Jl8.LIZ(I3.getMobMap());
            searchCreationEntranceAssem.K3(LIZ);
            IOpenTextNextService openTextNextService = AVExternalServiceImpl.LIZ().openTextNextService();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_search_creation_data", I3);
            bundle.putString("shoot_way", "hashtag_search");
            bundle.putString("enter_from", "general_search");
            bundle.putString("creation_id", LIZ);
            openTextNextService.textCanvasGoNext(LJ, bundle);
            AVExternalServiceImpl.LIZ().openTextNextService().loadTextModeRes();
            ((SearchCreationEntranceAssem) iDaS201S0200000_8.l1).H3();
        }
    }

    public static final void LIZ$5(IDaS201S0200000_8 iDaS201S0200000_8, View view) {
        if (view != null) {
            IAppWidgetService iAppWidgetService = (IAppWidgetService) K76.LIZ.getValue();
            Context context = ((SY4) iDaS201S0200000_8.l0).getContext();
            o.LJIIIIZZ(context, "context");
            iAppWidgetService.LJFF(context);
            K76.LIZIZ("click_confirm");
            View contentView = (View) iDaS201S0200000_8.l1;
            o.LJIIIIZZ(contentView, "contentView");
            ASQ.LIZLLL((View) iDaS201S0200000_8.l1, ASX.LIZ);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDaS201S0200000_8(android.view.View r4, com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ui.SearchCreationEntranceAssem r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            switch(r6) {
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r0 = 1000(0x3e8, double:4.94E-321)
        Lc:
            r2.<init>(r0)
            return
        L10:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.IDaS201S0200000_8.<init>(android.view.View, com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ui.SearchCreationEntranceAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS201S0200000_8(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
