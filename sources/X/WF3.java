package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class WF3 extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public C81392Vwy<W5B> LJLILLLLZI;
    public final /* synthetic */ WF7 LJLJI;

    public final void L(Bitmap bitmap) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLIL.getLayoutParams();
        WF7 wf7 = this.LJLJI;
        int i = wf7.LJLLILLLL % wf7.LJLLJ.LIZLLL;
        int width = (bitmap.getWidth() * i) / this.LJLJI.LJLLJ.LIZLLL;
        if (i == 0 || width <= 0 || width >= bitmap.getWidth()) {
            return;
        }
        marginLayoutParams.width = i;
        this.LJLIL.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, bitmap.getHeight()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WF3(WF7 wf7, ViewGroup viewGroup) {
        super(C28289B8j.LIZ(viewGroup, R.layout.bcn, viewGroup, false));
        this.LJLJI = wf7;
        this.LJLIL = (ImageView) this.itemView.findViewById(R.id.fbb);
    }

    public final void M(C81392Vwy<W5B> c81392Vwy, boolean z) {
        Bitmap underlyingBitmap = c81392Vwy.LJI().getUnderlyingBitmap();
        if (underlyingBitmap != null && !underlyingBitmap.isRecycled() && this.LJLIL != null) {
            C81392Vwy.LJ(this.LJLILLLLZI);
            this.LJLILLLLZI = c81392Vwy;
            this.LJLIL.setImageBitmap(underlyingBitmap);
            if (!z) {
                return;
            }
            L(underlyingBitmap);
        }
    }
}
