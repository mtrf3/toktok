package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ProductCell;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ProductSeeAllCell;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JbB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49465JbB extends SYL {
    public static final int LLLIIIIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public final boolean LLLFF;
    public InterfaceC49469JbF LLLFFI;
    public InterfaceC49468JbE LLLFZ;
    public InterfaceC65784Pro<C76800UCe> LLLI;
    public boolean LLLII;
    public int LLLIIII;

    public final void setData(ProductGroup data) {
        o.LJIIIZ(data, "data");
        getState().LJFF();
        this.LLLIIII = 0;
        List<Product> list = data.productList;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (Product product : list) {
                if (product.activityInfo != null) {
                    this.LLLII = true;
                }
                arrayList.add(new C49464JbA(product, this.LLLFZ, this.LLLFFI));
            }
            getState().LJ(arrayList);
        }
        if (o.LJ(data.hasMore, Boolean.TRUE)) {
            getState().LIZJ(new C49467JbD(new AqS158S0100000_8(this, 169)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49465JbB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setClipToPadding(false);
        setOrientation(0);
        LJII(new C49466JbC(this), -1);
        C26338AVi.LJIIIZ(this, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), Integer.valueOf(LLLIIIIL), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 0, 16);
        this.LLLF.LJZL(ProductCell.class, ProductSeeAllCell.class);
        AbstractC029409q adapter = getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new C49471JbH(this));
        }
        this.LLLFF = true;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        ProductCell productCell;
        int height;
        int i3 = this.LLLIIII;
        if (i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        int i4 = 0;
        RecyclerView.ViewHolder LJJIZ = LJJIZ(0);
        if (LJJIZ == null) {
            LJJIZ = LJJJ(0, false);
        }
        if (!(LJJIZ instanceof ProductCell) || (productCell = (ProductCell) LJJIZ) == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.LLLII) {
            SmartImageView smartImageView = productCell.LJLIL;
            if (smartImageView != null) {
                int height2 = smartImageView.getHeight();
                SmartImageView smartImageView2 = productCell.LJLIL;
                if (smartImageView2 != null) {
                    int L = ProductCell.L(smartImageView2) + height2;
                    TextView textView = productCell.LJLILLLLZI;
                    if (textView != null) {
                        int height3 = textView.getHeight();
                        TextView textView2 = productCell.LJLILLLLZI;
                        if (textView2 != null) {
                            int L2 = ProductCell.L(textView2) + height3;
                            TextView textView3 = productCell.LJLJI;
                            if (textView3 != null) {
                                int height4 = textView3.getHeight();
                                TextView textView4 = productCell.LJLJI;
                                if (textView4 != null) {
                                    int L3 = ProductCell.L(textView4) + height4;
                                    ViewGroup viewGroup = productCell.LJLJJI;
                                    if (viewGroup != null) {
                                        int visibility = viewGroup.getVisibility();
                                        ViewGroup viewGroup2 = productCell.LJLJJI;
                                        if (viewGroup2 != null) {
                                            if (viewGroup2.getVisibility() != 0) {
                                                ViewGroup viewGroup3 = productCell.LJLJJI;
                                                if (viewGroup3 != null) {
                                                    if (viewGroup3.getVisibility() != 4) {
                                                        viewGroup3.setVisibility(4);
                                                    }
                                                } else {
                                                    o.LJIJI("tagLayout");
                                                    throw null;
                                                }
                                            }
                                            ViewGroup viewGroup4 = productCell.LJLJJI;
                                            if (viewGroup4 != null) {
                                                if (viewGroup4.getHeight() <= 0) {
                                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    ViewGroup viewGroup5 = productCell.LJLJJI;
                                                    if (viewGroup5 != null) {
                                                        viewGroup5.measure(0, makeMeasureSpec);
                                                        ViewGroup viewGroup6 = productCell.LJLJJI;
                                                        if (viewGroup6 != null) {
                                                            height = viewGroup6.getMeasuredHeight();
                                                        } else {
                                                            o.LJIJI("tagLayout");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("tagLayout");
                                                        throw null;
                                                    }
                                                } else {
                                                    ViewGroup viewGroup7 = productCell.LJLJJI;
                                                    if (viewGroup7 != null) {
                                                        height = viewGroup7.getHeight();
                                                    } else {
                                                        o.LJIJI("tagLayout");
                                                        throw null;
                                                    }
                                                }
                                                ViewGroup viewGroup8 = productCell.LJLJJI;
                                                if (viewGroup8 != null) {
                                                    int L4 = ProductCell.L(viewGroup8) + height;
                                                    ViewGroup viewGroup9 = productCell.LJLJJI;
                                                    if (viewGroup9 != null) {
                                                        viewGroup9.setVisibility(visibility);
                                                        i4 = L + L2 + L4 + L3;
                                                    } else {
                                                        o.LJIJI("tagLayout");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("tagLayout");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("tagLayout");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("tagLayout");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("tagLayout");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("priceText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("priceText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("titleText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("titleText");
                        throw null;
                    }
                } else {
                    o.LJIJI("coverImage");
                    throw null;
                }
            }
        } else {
            SmartImageView smartImageView3 = productCell.LJLIL;
            if (smartImageView3 != null) {
                int height5 = smartImageView3.getHeight();
                SmartImageView smartImageView4 = productCell.LJLIL;
                if (smartImageView4 != null) {
                    int L5 = ProductCell.L(smartImageView4) + height5;
                    TextView textView5 = productCell.LJLILLLLZI;
                    if (textView5 != null) {
                        int height6 = textView5.getHeight();
                        TextView textView6 = productCell.LJLILLLLZI;
                        if (textView6 != null) {
                            int L6 = ProductCell.L(textView6) + height6;
                            TextView textView7 = productCell.LJLJI;
                            if (textView7 != null) {
                                int height7 = textView7.getHeight();
                                TextView textView8 = productCell.LJLJI;
                                if (textView8 != null) {
                                    i4 = L5 + L6 + ProductCell.L(textView8) + height7;
                                } else {
                                    o.LJIJI("priceText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("priceText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("titleText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("titleText");
                        throw null;
                    }
                } else {
                    o.LJIJI("coverImage");
                    throw null;
                }
            }
        }
        int i5 = i4 + LLLIIIIL;
        this.LLLIIII = i5;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
    }
}
