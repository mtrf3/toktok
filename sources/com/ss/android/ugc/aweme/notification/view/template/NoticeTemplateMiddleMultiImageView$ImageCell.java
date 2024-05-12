package com.ss.android.ugc.aweme.notification.view.template;

import X.C117014iX;
import X.C117024iY;
import X.C1DI;
import X.C62846OlW;
import X.C78765Uvh;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NoticeTemplateMiddleMultiImageView$ImageCell extends PowerCell<C117024iY> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C117024iY c117024iY) {
        C117024iY t = c117024iY;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        int width = this.itemView.getWidth();
        int i = C117014iX.LLLFZ;
        if (width != i) {
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
        C78765Uvh.LJFF((C62846OlW) this.itemView.findViewById(R.id.egd), t.LJLIL);
        if (t.LJLILLLLZI > 0) {
            this.itemView.findViewById(R.id.c_z).setVisibility(0);
            this.itemView.findViewById(R.id.gmm).setVisibility(0);
            TextView textView = (TextView) this.itemView.findViewById(R.id.gmm);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('+');
            LIZ.append(t.LJLILLLLZI);
            textView.setText(X1D.LIZIZ(LIZ));
            return;
        }
        this.itemView.findViewById(R.id.c_z).setVisibility(8);
        this.itemView.findViewById(R.id.gmm).setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.tj, viewGroup, false, "from(parent.context).inf…le_images, parent, false)");
    }
}
