package kotlin.jvm.internal;

import X.ARH;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C00F;
import X.C142355iJ;
import X.C225298sn;
import X.C42517GmP;
import X.C44694HgQ;
import X.C76800UCe;
import X.EnumC44013HPd;
import X.HVB;
import X.HVC;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.Y6N;
import android.app.Activity;
import com.ss.android.ugc.aweme.album.ToolsAlbumServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import defpackage.e1;

/* loaded from: classes8.dex */
public class AqS4S2300000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S2300000_7 aqS4S2300000_7, Object obj) {
        EnumC44013HPd enumC44013HPd;
        if (((Boolean) obj).booleanValue()) {
            HVB LIZ = ToolsAlbumServiceImpl.LIZIZ().LIZ(new HVC("story", aqS4S2300000_7.s0, aqS4S2300000_7.s1));
            int LIZ2 = C00F.LIZ(31744, 0, "studio_config_open_album_with_story", true);
            if (LIZ2 != 1) {
                if (LIZ2 != 2) {
                    if (LIZ2 != 3) {
                        enumC44013HPd = EnumC44013HPd.DEFAULT;
                    } else {
                        enumC44013HPd = EnumC44013HPd.ALL;
                    }
                } else {
                    enumC44013HPd = EnumC44013HPd.VIDEO;
                }
            } else {
                enumC44013HPd = EnumC44013HPd.PHOTO;
            }
            LIZ.LIZ(enumC44013HPd);
            if (e1.LIZ(31744, "studio_config_story_album_record_entrance", true, false) || C142355iJ.LIZ()) {
                LIZ.LJ((EnterStoryParam) aqS4S2300000_7.l2);
            }
            LIZ.LIZJ = true;
            LIZ.LIZLLL((Activity) aqS4S2300000_7.l3);
        } else {
            ((InterfaceC65784Pro) aqS4S2300000_7.l4).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S2300000_7 aqS4S2300000_7, Object obj) {
        String path = (String) obj;
        o.LJIIIZ(path, "path");
        C225298sn.LIZ(1, 0, (Aweme) aqS4S2300000_7.l2, aqS4S2300000_7.s0);
        if (path.length() > 0) {
            ShareServiceImpl.LJJJLZIJ().LJJJ((Aweme) aqS4S2300000_7.l2, (ActivityC45651qj) aqS4S2300000_7.l3, C44694HgQ.LJIIIIZZ(path), aqS4S2300000_7.s0, aqS4S2300000_7.s1, (SharePackage) aqS4S2300000_7.l4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS4S2300000_7 aqS4S2300000_7, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJFF(aqS4S2300000_7.s0, new AqS138S0200000_7((InterfaceC65784Pro) aqS4S2300000_7.l2, (InterfaceC65784Pro<C76800UCe>) aqS4S2300000_7.l3, (C42517GmP) 110));
        buttonGroup.LJII(aqS4S2300000_7.s1, new AqS172S0100000_6((InterfaceC65784Pro) aqS4S2300000_7.l4, (InterfaceC65784Pro<C76800UCe>) 137));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S2300000_7(String str, Aweme aweme, ActivityC45651qj activityC45651qj, String str2, SharePackage sharePackage, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = aweme;
        this.l3 = activityC45651qj;
        this.s1 = str2;
        this.l4 = sharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS4S2300000_7(String str, String str2, String str3, EnterStoryParam enterStoryParam, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = enterStoryParam;
        this.l4 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S2300000_7(String str, String str2, AqS165S0100000_15 aqS165S0100000_15, C42517GmP c42517GmP, Y6N y6n, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = aqS165S0100000_15;
        this.l3 = c42517GmP;
        this.l4 = y6n;
    }
}
