package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.slot.IIconSlot;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetAdapter$showDeleteAlert$1$1", f = "SlotsBottomSheetAdapter.kt", l = {215}, m = "invokeSuspend")
/* renamed from: X.Cd3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31745Cd3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ DialogC31813Ce9 LJLJI;
    public final /* synthetic */ InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ C31743Cd1 LJLJJLL;
    public final /* synthetic */ DialogInterface LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31745Cd3(DialogC31813Ce9 dialogC31813Ce9, InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> interfaceC31710CcU, View view, C31743Cd1 c31743Cd1, DialogInterface dialogInterface, InterfaceC67352kd<? super C31745Cd3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = dialogC31813Ce9;
        this.LJLJJI = interfaceC31710CcU;
        this.LJLJJL = view;
        this.LJLJJLL = c31743Cd1;
        this.LJLJL = dialogInterface;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C31745Cd3(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                arrayList = (ArrayList) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            DialogC31813Ce9 dialogC31813Ce9 = this.LJLJI;
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveLoadingDialog", "show", dialogC31813Ce9, new Object[0], "void", new C65300Pk0(false, "()V", "8065050026378570267")).LIZ) {
                dialogC31813Ce9.show();
            }
            arrayList = new ArrayList();
            XIA xia = C78613UtF.LIZJ;
            C31746Cd4 c31746Cd4 = new C31746Cd4(arrayList, this.LJLJJLL, this.LJLJJI, null);
            this.LJLIL = arrayList;
            this.LJLILLLLZI = 1;
            if (XKX.LJI(xia, c31746Cd4, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.dismiss();
        if (arrayList.isEmpty()) {
            InterfaceC31687Cc7 LIZ = this.LJLJJI.LLJJJIL().LIZ();
            if (LIZ != null) {
                LIZ.LIZ(this.LJLJJL, "before_live_dialog_item");
            }
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = Boolean.valueOf(((Boolean) next).booleanValue() & ((Boolean) it.next()).booleanValue());
                }
                if (((Boolean) next).booleanValue()) {
                    InterfaceC31687Cc7 LIZ2 = this.LJLJJI.LLJJJIL().LIZ();
                    if (LIZ2 != null) {
                        LIZ2.LIZ(this.LJLJJL, "before_live_dialog_item");
                    }
                } else {
                    Context context = this.LJLJJLL.LJLIL.getContext();
                    if (context != null) {
                        str = context.getString(R.string.g5l);
                    }
                    C30868C9o.LJI(str);
                }
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        this.LJLJL.dismiss();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
