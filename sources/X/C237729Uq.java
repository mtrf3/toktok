package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.prompt.PromptHistoryFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistoryFragment$showUndoDialog$1$1$1$1", f = "PromptHistoryFragment.kt", l = {323}, m = "invokeSuspend")
/* renamed from: X.9Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237729Uq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C9Y7 LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PromptHistoryFragment LJLJI;
    public final /* synthetic */ C237749Us LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237729Uq(PromptHistoryFragment promptHistoryFragment, C237749Us c237749Us, InterfaceC67352kd<? super C237729Uq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = promptHistoryFragment;
        this.LJLJJI = c237749Us;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237729Uq(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C9Y7 c9y7;
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 == 1) {
                c9y7 = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Bundle arguments = this.LJLJI.getArguments();
            if (arguments == null || (str = arguments.getString("event_type")) == null) {
                str = "homepage_hot";
            }
            Bundle arguments2 = this.LJLJI.getArguments();
            if (arguments2 == null || (str2 = arguments2.getString("enter_method")) == null) {
                str2 = "icon";
            }
            String returnedQuery = this.LJLJJI.LJLIL.getReturnedQuery();
            C188727au LIZLLL = KNV.LIZLLL(returnedQuery, "undoContent");
            LIZLLL.LJIIIZ("enter_from", str);
            LIZLLL.LJIIIZ("enter_method", str2);
            LIZLLL.LJIIIZ("undo_content", returnedQuery);
            FMX.LJIIL("customize_fyp_undo", LIZLLL.LIZ);
            AbstractC029409q adapter = ((RecyclerView) this.LJLJI._$_findCachedViewById(R.id.isd)).getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.prompt.PromptHistoryAdapter");
            c9y7 = (C9Y7) adapter;
            C237749Us c237749Us = this.LJLJJI;
            c237749Us.LJLILLLLZI = true;
            c9y7.notifyItemChanged(((ArrayList) c9y7.LJLIL).indexOf(c237749Us));
            XIA xia = C78613UtF.LIZJ;
            C237719Up c237719Up = new C237719Up(this.LJLJI, this.LJLJJI, null);
            this.LJLIL = c9y7;
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(xia, c237719Up, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            this.LJLJI.vl(c9y7.getItemCount() - 1, true);
            C237749Us prompt = this.LJLJJI;
            o.LJIIIZ(prompt, "prompt");
            int indexOf = ((ArrayList) c9y7.LJLIL).indexOf(prompt);
            if (indexOf >= 0) {
                ListProtector.remove(c9y7.LJLIL, indexOf);
                c9y7.notifyItemRemoved(indexOf);
            }
            if (((ArrayList) c9y7.LJLIL).isEmpty()) {
                this.LJLJI.wl();
            }
        } else {
            C237749Us c237749Us2 = this.LJLJJI;
            c237749Us2.LJLILLLLZI = false;
            c9y7.getClass();
            c9y7.notifyItemChanged(((ArrayList) c9y7.LJLIL).indexOf(c237749Us2));
        }
        PromptHistoryFragment promptHistoryFragment = this.LJLJI;
        promptHistoryFragment.getClass();
        if (booleanValue) {
            i = R.string.ji6;
        } else {
            i = R.string.ji7;
        }
        String string = promptHistoryFragment.getString(i);
        o.LJIIIIZZ(string, "if (success) getString(R…FYP_managPrefPage_toast2)");
        C26045AKb c26045AKb = new C26045AKb(promptHistoryFragment);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
