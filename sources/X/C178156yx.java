package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS11S0401000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.6yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178156yx extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Integer>, C76800UCe> {
    public final /* synthetic */ KeyboardInputV2Assem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C178156yx(KeyboardInputV2Assem keyboardInputV2Assem) {
        super(2);
        this.LJLIL = keyboardInputV2Assem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Integer> c43i) {
        Integer num;
        C176996x5 L1;
        String str;
        String str2;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        List<CommentImageModel> list = null;
        if (c43i2 != null) {
            num = (Integer) c43i2.LIZ;
        } else {
            num = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("photo select clicked, fragment = ");
        LIZ.append(c43i2);
        C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
        if (num != null) {
            if (num.intValue() == 2) {
                KeyboardInputV2Assem assem = this.LJLIL;
                AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(assem, LiveTryModeCountDownThresholdSetting.DEFAULT);
                IDqS428S0100000_3 iDqS428S0100000_3 = new IDqS428S0100000_3(selectSubscribe, 2);
                o.LJIIIZ(assem, "assem");
                Context context = assem.getContext();
                if (context != null) {
                    C26227ARb LIZ2 = C3AW.LIZ(context);
                    LIZ2.LJFF(context.getResources().getString(R.string.dig));
                    LIZ2.LIZIZ(context.getResources().getString(R.string.dif));
                    UC0.LIZJ(LIZ2, new AqS11S0401000_3(context, assem, 0, iDqS428S0100000_3, (InterfaceC65784Pro) null, 0));
                    LIZ2.LIZJ(new AqS167S0100000_1(aqS153S0100000_3, (InterfaceC65784Pro<C76800UCe>) 213));
                    LIZ2.LJII = false;
                    LIZ2.LJI().LIZLLL();
                }
            } else if (num.intValue() == 0) {
                C77321UWf.LJFF(this.LJLIL, 0, new IDqS428S0100000_3(selectSubscribe, 3));
            } else if (num.intValue() == 1 && (L1 = this.LJLIL.L1()) != null && L1.LJZL != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C177336xd I3 = this.LJLIL.I3();
                String str3 = "";
                if (I3 == null || (str = I3.LJLJJLL) == null) {
                    str = "";
                }
                linkedHashMap.put("enter_from", str);
                linkedHashMap.put("source", "editing_photo");
                C176996x5 L12 = this.LJLIL.L1();
                if (L12 != null) {
                    list = L12.LJZL;
                }
                ArrayList arrayList = new ArrayList(list);
                IDqS428S0100000_3 iDqS428S0100000_32 = new IDqS428S0100000_3(selectSubscribe, 4);
                Intent intent = new Intent(selectSubscribe.getContext(), (Class<?>) PhotoDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("image_uri", arrayList);
                bundle.putInt("request_code", 0);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                intent.putExtras(bundle);
                C212428Vi.LJFF(selectSubscribe, selectSubscribe, intent, 0, null, iDqS428S0100000_32);
                C177336xd I32 = this.LJLIL.I3();
                if (I32 != null && (str2 = I32.LJLJJLL) != null) {
                    str3 = str2;
                }
                C74Z.LJJIIZI(str3, "editing_photo");
            }
        }
        return C76800UCe.LIZ;
    }
}
