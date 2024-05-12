package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VrE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81036VrE<VH extends RecyclerView.ViewHolder> extends AbstractC029409q<VH> {
    public Cursor LJLIL;
    public int LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        Cursor cursor = this.LJLIL;
        if (cursor == null || cursor.isClosed()) {
            return 0;
        }
        return this.LJLIL.getCount();
    }

    public AbstractC81036VrE() {
        setHasStableIds(true);
        LJLLLLLL(null);
    }

    public final void LJLLLLLL(Cursor cursor) {
        if (cursor == this.LJLIL) {
            return;
        }
        if (cursor != null) {
            this.LJLIL = cursor;
            this.LJLILLLLZI = cursor.getColumnIndexOrThrow("_id");
            notifyDataSetChanged();
        } else {
            notifyItemRangeRemoved(0, getItemCount());
            this.LJLIL = null;
            this.LJLILLLLZI = -1;
        }
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        Cursor cursor = this.LJLIL;
        if (cursor != null && !cursor.isClosed()) {
            if (this.LJLIL.moveToPosition(i)) {
                return this.LJLIL.getLong(this.LJLILLLLZI);
            }
            throw new IllegalStateException(C0NY.LIZIZ("Could not move cursor to position ", i, " when trying to get an item id"));
        }
        throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLIL.moveToPosition(i)) {
            if (Item.LJ(this.LJLIL).id == -1) {
                return 1;
            }
            return 2;
        }
        throw new IllegalStateException(C0NY.LIZIZ("Could not move cursor to position ", i, " when trying to get item view type."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.W5O, REQUEST] */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(VH vh, int i) {
        int i2;
        Drawable.ConstantState constantState;
        Cursor cursor = this.LJLIL;
        if (cursor != null && !cursor.isClosed()) {
            if (this.LJLIL.moveToPosition(i)) {
                Cursor cursor2 = this.LJLIL;
                C81038VrG c81038VrG = (C81038VrG) this;
                if (vh instanceof C81039VrH) {
                    C81039VrH c81039VrH = (C81039VrH) vh;
                    Drawable[] compoundDrawables = c81039VrH.LJLIL.getCompoundDrawables();
                    TypedArray obtainStyledAttributes = vh.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.a1g});
                    int color = obtainStyledAttributes.getColor(0, 0);
                    obtainStyledAttributes.recycle();
                    for (int i3 = 0; i3 < compoundDrawables.length; i3++) {
                        Drawable drawable = compoundDrawables[i3];
                        if (drawable != null && (constantState = drawable.getConstantState()) != null) {
                            Drawable mutate = constantState.newDrawable().mutate();
                            mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                            mutate.setBounds(drawable.getBounds());
                            compoundDrawables[i3] = mutate;
                        }
                    }
                    c81039VrH.LJLIL.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                    return;
                }
                if (vh instanceof C81040VrI) {
                    C81040VrI c81040VrI = (C81040VrI) vh;
                    Item LJ = Item.LJ(cursor2);
                    ViewOnClickListenerC81037VrF viewOnClickListenerC81037VrF = c81040VrI.LJLIL;
                    Context context = viewOnClickListenerC81037VrF.getContext();
                    if (c81038VrG.LJLJLJ == 0) {
                        int i4 = ((GridLayoutManager) c81038VrG.LJLJL.getLayoutManager()).LLIIIL;
                        int dimensionPixelSize = (context.getResources().getDisplayMetrics().widthPixels - ((i4 - 1) * context.getResources().getDimensionPixelSize(R.dimen.z_))) / i4;
                        c81038VrG.LJLJLJ = dimensionPixelSize;
                        c81038VrG.LJLJLJ = (int) (dimensionPixelSize * c81038VrG.LJLJJI.LJIIIZ);
                    }
                    viewOnClickListenerC81037VrF.LJLJJLL = new C81041VrJ(c81038VrG.LJLJLJ, c81038VrG.LJLJJI.LJFF, vh);
                    ViewOnClickListenerC81037VrF viewOnClickListenerC81037VrF2 = c81040VrI.LJLIL;
                    viewOnClickListenerC81037VrF2.LJLJJL = LJ;
                    ImageView imageView = viewOnClickListenerC81037VrF2.LJLJI;
                    if (LJ.LIZ()) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    imageView.setVisibility(i2);
                    viewOnClickListenerC81037VrF2.LJLILLLLZI.setCountable(viewOnClickListenerC81037VrF2.LJLJJLL.LIZIZ);
                    W5P LIZLLL = W5P.LIZLLL(viewOnClickListenerC81037VrF2.LJLJJL.uri);
                    int i5 = viewOnClickListenerC81037VrF2.LJLJJLL.LIZ;
                    LIZLLL.LIZJ = new C79238V7y(i5, i5);
                    ?? LIZ = LIZLLL.LIZ();
                    if (viewOnClickListenerC81037VrF2.LJLJJL.LIZ()) {
                        C81705W4v LIZJ = W5I.LIZJ();
                        LIZJ.LJIIL = viewOnClickListenerC81037VrF2.LJLIL.getController();
                        LIZJ.LIZLLL = LIZ;
                        LIZJ.LJIIJ = true;
                        viewOnClickListenerC81037VrF2.LJLIL.setController(LIZJ.LIZ());
                    } else {
                        viewOnClickListenerC81037VrF2.LJLIL.setImageRequest(LIZ);
                    }
                    if (viewOnClickListenerC81037VrF2.LJLJJL.LIZLLL()) {
                        viewOnClickListenerC81037VrF2.LJLJJI.setVisibility(0);
                        viewOnClickListenerC81037VrF2.LJLJJI.setText(DateUtils.formatElapsedTime(viewOnClickListenerC81037VrF2.LJLJJL.duration / 1000));
                    } else {
                        viewOnClickListenerC81037VrF2.LJLJJI.setVisibility(8);
                    }
                    c81040VrI.LJLIL.setOnMediaGridClickListener(c81038VrG);
                    ViewOnClickListenerC81037VrF viewOnClickListenerC81037VrF3 = c81040VrI.LJLIL;
                    if (c81038VrG.LJLJJI.LJFF) {
                        int LIZIZ = c81038VrG.LJLJI.LIZIZ(LJ);
                        if (LIZIZ > 0) {
                            viewOnClickListenerC81037VrF3.setCheckEnabled(true);
                            viewOnClickListenerC81037VrF3.setCheckedNum(LIZIZ);
                            return;
                        } else if (c81038VrG.LJLJI.LJ()) {
                            viewOnClickListenerC81037VrF3.setCheckEnabled(false);
                            viewOnClickListenerC81037VrF3.setCheckedNum(LiveLayoutPreloadThreadPriority.DEFAULT);
                            return;
                        } else {
                            viewOnClickListenerC81037VrF3.setCheckEnabled(true);
                            viewOnClickListenerC81037VrF3.setCheckedNum(LIZIZ);
                            return;
                        }
                    }
                    if (c81038VrG.LJLJI.LIZIZ.contains(LJ)) {
                        viewOnClickListenerC81037VrF3.setCheckEnabled(true);
                        viewOnClickListenerC81037VrF3.setChecked(true);
                        return;
                    } else if (c81038VrG.LJLJI.LJ()) {
                        viewOnClickListenerC81037VrF3.setCheckEnabled(false);
                        viewOnClickListenerC81037VrF3.setChecked(false);
                        return;
                    } else {
                        viewOnClickListenerC81037VrF3.setCheckEnabled(true);
                        viewOnClickListenerC81037VrF3.setChecked(false);
                        return;
                    }
                }
                return;
            }
            throw new IllegalStateException(C0NY.LIZIZ("Could not move cursor to position ", i, " when trying to bind view holder"));
        }
        throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
    }
}
