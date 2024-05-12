package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43I;
import X.C74496TLo;
import X.C76800UCe;
import X.C78764Uvg;
import X.C81705W4v;
import X.C81810W8w;
import X.InterfaceC88474Ynu;
import X.SI6;
import X.SR2;
import X.TAK;
import X.W1T;
import X.W5G;
import X.W5I;
import X.W5P;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.library.LibraryDetailFragment;
import com.ss.android.ugc.aweme.profile.aigc.AvatarCell;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Set;

/* loaded from: classes13.dex */
public class IDqS455S0100000_12 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS455S0100000_12(C74496TLo c74496TLo, int i) {
        super(4);
        this.$t = i;
        this.l0 = c74496TLo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS455S0100000_12(ChallengeDetailFragment challengeDetailFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = challengeDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS455S0100000_12(LibraryDetailFragment libraryDetailFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = libraryDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS455S0100000_12(AvatarCell avatarCell, int i) {
        super(4);
        this.$t = i;
        this.l0 = avatarCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS455S0100000_12(EffectEditAssem effectEditAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = effectEditAssem;
    }

    public static final Object invoke$0(IDqS455S0100000_12 iDqS455S0100000_12, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup.LayoutParams layoutParams;
        ((Number) obj).intValue();
        int intValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) iDqS455S0100000_12.l0;
        challengeDetailFragment.LLFF = intValue;
        View _$_findCachedViewById = challengeDetailFragment._$_findCachedViewById(R.id.aj5);
        if (_$_findCachedViewById != null && (layoutParams = _$_findCachedViewById.getLayoutParams()) != null) {
            ChallengeDetailFragment challengeDetailFragment2 = (ChallengeDetailFragment) iDqS455S0100000_12.l0;
            layoutParams.height = ((ChallengeDetailFragment) iDqS455S0100000_12.l0)._$_findCachedViewById(R.id.la4).getHeight() + challengeDetailFragment2._$_findCachedViewById(R.id.kej).getHeight() + challengeDetailFragment2.LLFF;
        }
        View _$_findCachedViewById2 = ((ChallengeDetailFragment) iDqS455S0100000_12.l0)._$_findCachedViewById(R.id.aj5);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.requestLayout();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS455S0100000_12 iDqS455S0100000_12, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ((LibraryDetailFragment) iDqS455S0100000_12.l0).getClass();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(IDqS455S0100000_12 iDqS455S0100000_12, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        C43I mode = (C43I) obj;
        C43I selectedAvatar = (C43I) obj2;
        C43I selectedDownloadItems = (C43I) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(selectedAvatar, "selectedAvatar");
        o.LJIIIZ(selectedDownloadItems, "selectedDownloadItems");
        ((AvatarCell) iDqS455S0100000_12.l0).L((SR2) mode.LIZ, (SI6) selectedAvatar.LIZ, (Set) selectedDownloadItems.LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.W5O, REQUEST] */
    public static final Object invoke$3(IDqS455S0100000_12 iDqS455S0100000_12, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        EditImage editImage = (EditImage) obj;
        UrlModel urlModel = (UrlModel) obj2;
        String str = (String) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (editImage != null) {
            W5G draweeView = ((EffectEditAssem) iDqS455S0100000_12.l0).M3();
            String uri = editImage.url.toString();
            o.LJIIIIZZ(uri, "it.url.toString()");
            o.LJIIIZ(draweeView, "draweeView");
            if (TextUtils.isEmpty(uri)) {
                C78764Uvg.LIZ(draweeView, R.drawable.c95);
            } else {
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(uri));
                LIZLLL.LJIIJJI = false;
                LIZLLL.LJIILIIL = false;
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
                ?? LIZ = LIZLLL.LIZ();
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJIIL = draweeView.getController();
                LIZJ.LIZLLL = LIZ;
                draweeView.setController(LIZJ.LIZ());
            }
        } else {
            int i = TAK.LIZ[((EffectEditAssem) iDqS455S0100000_12.l0).I3().mode.ordinal()];
            if (i != 1) {
                if (i == 2 && str != null) {
                    C78764Uvg.LJIIIZ(((EffectEditAssem) iDqS455S0100000_12.l0).M3(), Uri.fromFile(new File(str)).toString(), -1, -1);
                }
            } else {
                C78764Uvg.LJFF(((EffectEditAssem) iDqS455S0100000_12.l0).M3(), urlModel);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS455S0100000_12 iDqS455S0100000_12, Object data, Object obj, Object state, Object obj2) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        ((C74496TLo) iDqS455S0100000_12.l0).LJJJJJ.onNext(new W1T(data, Integer.valueOf(intValue), state, obj2));
        return C76800UCe.LIZ;
    }
}
