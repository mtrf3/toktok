package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.C181627Aw;
import X.C1FP;
import X.C229038yp;
import X.C229148z0;
import X.C43I;
import X.C72922tc;
import X.C76800UCe;
import X.C7H2;
import X.InterfaceC229138yz;
import X.InterfaceC88472Yns;
import X.OSZ;
import Y.AfS55S0100000_3;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;

/* loaded from: classes4.dex */
public class AqS12S1101000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS12S1101000_3 aqS12S1101000_3, Object obj) {
        C229038yp it = (C229038yp) obj;
        o.LJIIIZ(it, "it");
        if (!(it.LJLIL instanceof C72922tc)) {
            ((EditPlayListNameEditTextVM) aqS12S1101000_3.l1).setStateImmediate(C229148z0.LJLIL);
            EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) aqS12S1101000_3.l1;
            AbstractC73672Svk<CheckPlayResponse> checkPlaylistName = ((InterfaceC229138yz) editPlayListNameEditTextVM.LJLIL.getValue().getOperator()).checkPlaylistName(aqS12S1101000_3.i2, aqS12S1101000_3.s0);
            EditPlayListNameEditTextVM editPlayListNameEditTextVM2 = (EditPlayListNameEditTextVM) aqS12S1101000_3.l1;
            editPlayListNameEditTextVM.disposeOnClear(checkPlaylistName.LJJJLIIL(new AfS55S0100000_3(editPlayListNameEditTextVM2, 62), new AfS55S0100000_3(editPlayListNameEditTextVM2, 63)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S1101000_3 aqS12S1101000_3, Object obj) {
        C181627Aw setStateImmediate = (C181627Aw) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        C43I c43i = new C43I(new OSZ(Integer.valueOf(aqS12S1101000_3.i2), aqS12S1101000_3.s0));
        UpvoteStruct upvoteStruct = (UpvoteStruct) aqS12S1101000_3.l1;
        if (upvoteStruct == null) {
            upvoteStruct = C1FP.LJIIIIZZ(C7H2.LIZ(aqS12S1101000_3.s0));
        }
        return C181627Aw.LIZ(setStateImmediate, null, null, c43i, upvoteStruct, null, null, 51);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1101000_3(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = editPlayListNameEditTextVM;
        this.i2 = 1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1101000_3(int i, UpvoteStruct upvoteStruct, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = upvoteStruct;
    }
}
