package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C119624mk;
import X.C183907Jq;
import X.C183937Jt;
import X.C191707fi;
import X.C199627sU;
import X.C228428xq;
import X.C3C8;
import X.C76732zl;
import X.C76800UCe;
import X.C7IW;
import X.C8VR;
import X.C8YM;
import X.InterfaceC199637sV;
import X.InterfaceC212848Wy;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.OSZ;
import X.SY4;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public class IDqS182S0200000_3 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS182S0200000_3(C183907Jq c183907Jq, UpvoteStruct upvoteStruct, int i) {
        super(3);
        this.$t = i;
        this.l0 = c183907Jq;
        this.l1 = upvoteStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS182S0200000_3(C183937Jt c183937Jt, UpvoteStruct upvoteStruct, int i) {
        super(3);
        this.$t = i;
        this.l0 = c183937Jt;
        this.l1 = upvoteStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS182S0200000_3(C199627sU c199627sU, C191707fi c191707fi, int i) {
        super(3);
        this.$t = i;
        this.l0 = c199627sU;
        this.l1 = c191707fi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS182S0200000_3(InterfaceC199637sV interfaceC199637sV, C191707fi c191707fi, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC199637sV;
        this.l1 = c191707fi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS182S0200000_3(InterfaceC212848Wy interfaceC212848Wy, InterfaceC212848Wy<? extends RECEIVER> interfaceC212848Wy2, InterfaceC88474Ynu<? super RECEIVER, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        super(3);
        this.$t = interfaceC88474Ynu;
        this.l0 = interfaceC212848Wy;
        this.l1 = interfaceC212848Wy2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS182S0200000_3(C8YM c8ym, C8YM<RECEIVER> c8ym2, InterfaceC88474Ynu<? super RECEIVER, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        super(3);
        this.$t = interfaceC88474Ynu;
        this.l0 = c8ym;
        this.l1 = c8ym2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS182S0200000_3(MixFeedManagerFragment mixFeedManagerFragment, C76732zl c76732zl, int i) {
        super(3);
        this.$t = i;
        this.l0 = mixFeedManagerFragment;
        this.l1 = c76732zl;
    }

    public static final Object invoke$0(IDqS182S0200000_3 iDqS182S0200000_3, Object obj, Object obj2, Object obj3) {
        UrlModel urlModel;
        C119624mk avatarStart = (C119624mk) obj;
        ImageView avatarMiddle = (ImageView) obj2;
        ImageView avatarEnd = (ImageView) obj3;
        o.LJIIIZ(avatarStart, "avatarStart");
        o.LJIIIZ(avatarMiddle, "avatarMiddle");
        o.LJIIIZ(avatarEnd, "avatarEnd");
        avatarMiddle.setVisibility(8);
        avatarEnd.setVisibility(8);
        C7IW c7iw = C7IW.LIZ;
        Context context = ((C183937Jt) iDqS182S0200000_3.l0).getContext();
        o.LJIIIIZZ(context, "bubble.context");
        User user = ((UpvoteStruct) iDqS182S0200000_3.l1).getUser();
        if (user != null) {
            urlModel = user.getAvatarThumb();
        } else {
            urlModel = null;
        }
        c7iw.getClass();
        C7IW.LIZ(context, avatarStart, urlModel);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS182S0200000_3 iDqS182S0200000_3, Object obj, Object obj2, Object obj3) {
        UrlModel urlModel;
        C119624mk avatarStart = (C119624mk) obj;
        ImageView avatarMiddle = (ImageView) obj2;
        ImageView avatarEnd = (ImageView) obj3;
        o.LJIIIZ(avatarStart, "avatarStart");
        o.LJIIIZ(avatarMiddle, "avatarMiddle");
        o.LJIIIZ(avatarEnd, "avatarEnd");
        avatarMiddle.setVisibility(8);
        avatarEnd.setVisibility(8);
        Context context = ((C183907Jq) iDqS182S0200000_3.l0).getContext();
        o.LJIIIIZZ(context, "context");
        User user = ((UpvoteStruct) iDqS182S0200000_3.l1).getUser();
        if (user != null) {
            urlModel = user.getAvatarThumb();
        } else {
            urlModel = null;
        }
        C183907Jq.LJJLL(context, avatarStart, urlModel);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS182S0200000_3 iDqS182S0200000_3, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        OSZ anchor = (OSZ) obj2;
        Bitmap bitmap = (Bitmap) obj3;
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(bitmap, "bitmap");
        C199627sU c199627sU = (C199627sU) iDqS182S0200000_3.l0;
        c199627sU.getClass();
        c199627sU.LIZ = bitmap;
        float floatValue = ((Number) anchor.getFirst()).floatValue();
        float floatValue2 = ((Number) anchor.getSecond()).floatValue();
        c199627sU.LIZLLL = floatValue;
        c199627sU.LIZJ = floatValue2;
        c199627sU.LJ = ((C191707fi) iDqS182S0200000_3.l1).LIZJ().floatValue();
        String title = String.valueOf(booleanValue);
        o.LJIIIZ(title, "title");
        c199627sU.LIZIZ = title;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS182S0200000_3 iDqS182S0200000_3, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        OSZ anchor = (OSZ) obj2;
        Bitmap bitmap = (Bitmap) obj3;
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(bitmap, "bitmap");
        InterfaceC199637sV interfaceC199637sV = (InterfaceC199637sV) iDqS182S0200000_3.l0;
        interfaceC199637sV.LIZLLL(bitmap);
        interfaceC199637sV.LIZIZ(((Number) anchor.getFirst()).floatValue(), ((Number) anchor.getSecond()).floatValue());
        interfaceC199637sV.LIZ(((C191707fi) iDqS182S0200000_3.l1).LIZJ().floatValue());
        interfaceC199637sV.LIZJ(Boolean.valueOf(booleanValue));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS182S0200000_3 iDqS182S0200000_3, Object obj, Object obj2, Object obj3) {
        C3C8 actualReceiver = ((InterfaceC212848Wy) iDqS182S0200000_3.l0).getActualReceiver();
        if (actualReceiver != null) {
            C8VR.LIZIZ(actualReceiver, new AqS20S0500000_3((InterfaceC88474Ynu) iDqS182S0200000_3.l1, (InterfaceC88474Ynu<C3C8, Object, Object, Object, C76800UCe>) actualReceiver, (C3C8) obj, obj2, obj3, (Object) 6));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS182S0200000_3 iDqS182S0200000_3, Object obj, Object obj2, Object obj3) {
        C3C8 receiverForHostVM = ((C8YM) iDqS182S0200000_3.l0).getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = ((C8YM) iDqS182S0200000_3.l0).getActualReceiverHolder().getActualReceiver()) != null) {
            ((InterfaceC88474Ynu) iDqS182S0200000_3.l1).invoke(receiverForHostVM, obj, obj2, obj3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS182S0200000_3 iDqS182S0200000_3, Object selectSubscribe, Object obj, Object obj2) {
        boolean z;
        List list = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list != null) {
            MixFeedManagerFragment mixFeedManagerFragment = (MixFeedManagerFragment) iDqS182S0200000_3.l0;
            C76732zl c76732zl = (C76732zl) iDqS182S0200000_3.l1;
            C228428xq c228428xq = mixFeedManagerFragment.LJLILLLLZI;
            if (c228428xq != null) {
                SY4 addVideoView = c228428xq.getAddVideoView();
                if (addVideoView != null) {
                    if (list.size() < c76732zl.element) {
                        z = true;
                    } else {
                        z = false;
                    }
                    addVideoView.setEnabled(z);
                }
            } else {
                o.LJIJI("mBottomView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
