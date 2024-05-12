package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109114Pz extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJLJ = 0;
    public SharePanelViewModel LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109114Pz(View view, SharePanelViewModel viewModel) {
        super(view);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1032));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1035));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1033));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1034));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1031));
        this.LJLJL = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1030));
    }

    public final void L(C4NN c4nn, SharePanelViewModel newViewModel) {
        o.LJIIIZ(newViewModel, "newViewModel");
        this.LJLIL = newViewModel;
        if (c4nn.getBatchContacts().isEmpty()) {
            Object value = this.LJLJL.getValue();
            o.LJIIIIZZ(value, "<get-avatarLayout>(...)");
            ((View) value).setVisibility(8);
        } else if (c4nn.getBatchContacts().size() == 1) {
            Object value2 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value2, "<get-ivAvatar>(...)");
            C4AS.LJII((W5G) value2, ((IMContact) ListProtector.get(c4nn.getBatchContacts(), 0)).getDisplayAvatar(), "LongPressShareBatchViewHolder", null, null, 0, 0, 504);
            Object value3 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value3, "<get-ivAvatar>(...)");
            ((ImageView) value3).setVisibility(0);
            Object value4 = this.LJLJL.getValue();
            o.LJIIIIZZ(value4, "<get-avatarLayout>(...)");
            ((View) value4).setVisibility(0);
            Object value5 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value5, "<get-ivFirstAvatar>(...)");
            ((ImageView) value5).setVisibility(8);
            Object value6 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value6, "<get-ivSecondAvatar>(...)");
            ((ImageView) value6).setVisibility(8);
            Object value7 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value7, "<get-firstAvatarBackground>(...)");
            ((View) value7).setVisibility(8);
        } else {
            Object value8 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value8, "<get-ivFirstAvatar>(...)");
            C4AS.LJII((W5G) value8, ((IMContact) ListProtector.get(c4nn.getBatchContacts(), 0)).getDisplayAvatar(), "LongPressShareBatchViewHolder:0", null, null, 0, 0, 504);
            Object value9 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value9, "<get-ivSecondAvatar>(...)");
            C4AS.LJII((W5G) value9, ((IMContact) ListProtector.get(c4nn.getBatchContacts(), 1)).getDisplayAvatar(), "LongPressShareBatchViewHolder:1", null, null, 0, 0, 504);
            Object value10 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value10, "<get-ivAvatar>(...)");
            ((ImageView) value10).setVisibility(8);
            Object value11 = this.LJLJL.getValue();
            o.LJIIIIZZ(value11, "<get-avatarLayout>(...)");
            ((View) value11).setVisibility(0);
            Object value12 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value12, "<get-ivFirstAvatar>(...)");
            ((ImageView) value12).setVisibility(0);
            Object value13 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value13, "<get-ivSecondAvatar>(...)");
            ((ImageView) value13).setVisibility(0);
            Object value14 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value14, "<get-firstAvatarBackground>(...)");
            ((View) value14).setVisibility(0);
        }
        Object value15 = this.LJLJI.getValue();
        o.LJIIIIZZ(value15, "<get-tvName>(...)");
        ((TextView) value15).setText(c4nn.getDisplayName());
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(c4nn, this, 87), this.itemView);
        C107234It.LJIIIIZZ(c4nn, getBindingAdapterPosition(), "column", this.LJLIL.LJLIL, true);
    }
}
