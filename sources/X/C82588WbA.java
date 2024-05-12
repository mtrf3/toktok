package X;

import Y.ARunnableS50S0100000_14;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.IDlS65S0100000_14;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WbA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82588WbA extends RecyclerView.ViewHolder {
    public final FrameLayout LJLIL;
    public final InterfaceC82605WbR LJLILLLLZI;
    public final ImageView LJLJI;
    public final C81232VuO LJLJJI;
    public ObjectAnimator LJLJJL;
    public int LJLJJLL;
    public long LJLJL;

    public final void L() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJLJJL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJLJJL) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LJLJI;
        if (imageView == null) {
            return;
        }
        imageView.setRotation(0.0f);
    }

    public final void M(int i) {
        int i2;
        if (getAdapterPosition() == 0 || i == (i2 = this.LJLJJLL)) {
            return;
        }
        this.LJLJJLL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    this.LJLJL = System.currentTimeMillis();
                    ImageView imageView = this.LJLJI;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = this.LJLJI;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.th);
                    }
                    ImageView imageView3 = this.LJLJI;
                    if (imageView3 == null) {
                        return;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 360.0f);
                    this.LJLJJL = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator = this.LJLJJL;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatMode(1);
                    }
                    ObjectAnimator objectAnimator2 = this.LJLJJL;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator3 = this.LJLJJL;
                    if (objectAnimator3 == null) {
                        return;
                    }
                    objectAnimator3.start();
                    return;
                }
            } else {
                if (2 == i2 && this.LJLJL > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.LJLJL;
                    if (currentTimeMillis >= 100) {
                        ImageView imageView4 = this.LJLJI;
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                        }
                        L();
                        return;
                    }
                    this.itemView.postDelayed(new ARunnableS50S0100000_14(this, 212), 100 - currentTimeMillis);
                    return;
                }
                ImageView imageView5 = this.LJLJI;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                L();
                return;
            }
        }
        ImageView imageView6 = this.LJLJI;
        if (imageView6 != null) {
            imageView6.setImageResource(R.drawable.b5f);
        }
        ImageView imageView7 = this.LJLJI;
        if (imageView7 != null) {
            imageView7.setVisibility(0);
        }
        L();
    }

    public C82588WbA(FrameLayout frameLayout, InterfaceC82605WbR interfaceC82605WbR) {
        super(frameLayout);
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = interfaceC82605WbR;
        this.LJLJJLL = -1;
        this.LJLJI = (ImageView) this.itemView.findViewById(R.id.eyc);
        this.LJLJJI = (C81232VuO) this.itemView.findViewById(R.id.ek5);
        C16880lQ.LJIIJ(new IDlS65S0100000_14(this, 5), this.itemView);
    }
}
