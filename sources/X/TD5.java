package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.sticker.pagination.StickerFooterModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TD5<T> extends C73365Sqn<T> {
    public final View LJLJJL;
    public final View LJLJJLL;
    public final TextView LJLJL;

    public TD5(View view) {
        super(view);
        this.LJLJJL = view;
        View findViewById = view.findViewById(R.id.euf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_loading)");
        this.LJLJJLL = findViewById;
        View findViewById2 = view.findViewById(R.id.etz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.item_error)");
        this.LJLJL = (TextView) findViewById2;
    }

    @Override // X.C73365Sqn
    public final void L(int i, Object obj) {
        if (!(obj instanceof StickerFooterModel)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLJJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        StickerFooterModel stickerFooterModel = (StickerFooterModel) obj;
        Integer textRes = stickerFooterModel.getTextRes();
        if (textRes != null) {
            this.LJLJL.setText(this.LJLJJL.getContext().getText(textRes.intValue()));
        }
        TEN status = stickerFooterModel.getStatus();
        TEN ten = TEN.LOADING;
        if (status == ten || stickerFooterModel.getStatus() == TEN.ERROR) {
            marginLayoutParams.width = -1;
            Context context = this.LJLJJL.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            marginLayoutParams.height = C74275TDb.LIZJ(56.0d, context);
            Context context2 = this.LJLJJL.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            marginLayoutParams.bottomMargin = C74275TDb.LIZJ(75.0d, context2);
            this.LJLJJL.setLayoutParams(marginLayoutParams);
            this.LJLJJL.setLayoutParams(marginLayoutParams);
            if (stickerFooterModel.getStatus() == ten) {
                this.LJLJL.setVisibility(8);
                this.LJLJJLL.setVisibility(0);
                return;
            } else {
                this.LJLJL.setVisibility(0);
                this.LJLJJLL.setVisibility(8);
                return;
            }
        }
        marginLayoutParams.width = 0;
        marginLayoutParams.height = 0;
        marginLayoutParams.bottomMargin = 0;
        this.LJLJJL.setLayoutParams(marginLayoutParams);
        this.LJLJL.setVisibility(8);
        this.LJLJJLL.setVisibility(8);
    }
}
