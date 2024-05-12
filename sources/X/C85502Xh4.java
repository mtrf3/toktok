package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity$onCreate$6$1", f = "CreatorCaptionEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Xh4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85502Xh4 extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ boolean LJLIL;
    public final /* synthetic */ CreatorCaptionEditActivity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85502Xh4(CreatorCaptionEditActivity creatorCaptionEditActivity, InterfaceC67352kd<? super C85502Xh4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = creatorCaptionEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C85502Xh4 c85502Xh4 = new C85502Xh4(this.LJLILLLLZI, interfaceC67352kd);
        c85502Xh4.LJLIL = ((Boolean) obj).booleanValue();
        return c85502Xh4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        RecyclerView.ViewHolder LJJIZ;
        ArrayList arrayList;
        RecyclerView.ViewHolder LJJIZ2;
        List<CreatorCaptionEditData> transSubtitleItem;
        C141335gf.LIZJ(obj);
        boolean z = this.LJLIL;
        C85505Xh7 c85505Xh7 = (C85505Xh7) this.LJLILLLLZI.LLILII.getValue();
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        c85505Xh7.getClass();
        if (C77275UUl.LJIIIIZZ(0, 8, 4).contains(Integer.valueOf(i))) {
            c85505Xh7.LIZ.setVisibility(i);
        }
        FrameLayout LLIL = this.LJLILLLLZI.LLIL();
        if (z) {
            i2 = 8;
        }
        LLIL.setVisibility(i2);
        CreatorCaptionEditActivity creatorCaptionEditActivity = this.LJLILLLLZI;
        int LLFZ = creatorCaptionEditActivity.LLFZ(creatorCaptionEditActivity.LLILIL().LIZLLL());
        if (z) {
            CreatorCaptionEditViewModel LLII = this.LJLILLLLZI.LLII();
            CreatorCaptionEditItem creatorCaptionEditItem = LLII.LJLJJLL;
            if (creatorCaptionEditItem != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null) {
                arrayList = new ArrayList(C32I.LJJL(transSubtitleItem, 10));
                Iterator<CreatorCaptionEditData> it = transSubtitleItem.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getText());
                }
            } else {
                arrayList = null;
            }
            LLII.LJLJL = arrayList;
            C85511XhD c85511XhD = this.LJLILLLLZI.LJLILLLLZI;
            if (c85511XhD != null) {
                RecyclerView recyclerView = c85511XhD.LJLJL;
                if (recyclerView != null && (LJJIZ2 = recyclerView.LJJIZ(LLFZ)) != null) {
                    C85513XhF c85513XhF = (C85513XhF) LJJIZ2;
                    c85513XhF.LJLIL.requestFocus();
                    KeyboardUtils.LIZJ(c85513XhF.LJLIL);
                }
            } else {
                o.LJIJI("creatorCaptionEditAdapter");
                throw null;
            }
        } else {
            C85511XhD c85511XhD2 = this.LJLILLLLZI.LJLILLLLZI;
            if (c85511XhD2 != null) {
                RecyclerView recyclerView2 = c85511XhD2.LJLJL;
                if (recyclerView2 != null && (LJJIZ = recyclerView2.LJJIZ(LLFZ)) != null) {
                    ((C85513XhF) LJJIZ).LJLIL.clearFocus();
                }
                C85511XhD c85511XhD3 = this.LJLILLLLZI.LJLILLLLZI;
                if (c85511XhD3 != null) {
                    c85511XhD3.LJZ();
                } else {
                    o.LJIJI("creatorCaptionEditAdapter");
                    throw null;
                }
            } else {
                o.LJIJI("creatorCaptionEditAdapter");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Boolean bool, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
