package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class AP9 extends FrameLayout {
    public SmartAvatarImageView LJLIL;
    public ImageView LJLILLLLZI;
    public UserVerify LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public int[] LJLJJLL;

    public final void LIZ() {
        this.LJLILLLLZI.setVisibility(8);
    }

    public FrameLayout.LayoutParams getAvatarLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public int getVerifyIconMarginEnd() {
        return -this.LJLJJL;
    }

    public SmartAvatarImageView getAvatarImageView() {
        return this.LJLIL;
    }

    public int getVerifyIconSize() {
        return this.LJLJJI;
    }

    private void setFailureImage(int i) {
        V92 hierarchy = this.LJLIL.getHierarchy();
        C78714Uus c78714Uus = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
        hierarchy.LJIILL(hierarchy.LIZIZ.getDrawable(i), 5);
        hierarchy.LJIIL(5).LJIIZILJ(c78714Uus);
    }

    public void setPlaceHolder(int i) {
        this.LJLIL.getHierarchy().LJIJI(i, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }

    public void setPlaceHolderImage(Drawable drawable) {
        this.LJLIL.setPlaceholderImage(drawable);
    }

    public void setRequestImgSize(int[] iArr) {
        this.LJLJJLL = iArr;
    }

    public void setUserData(UserVerify userVerify) {
        UserVerify userVerify2 = this.LJLJI;
        if (userVerify2 != null && userVerify != null && userVerify2.getAvatarThumb() == userVerify.getAvatarThumb()) {
            return;
        }
        int i = 0;
        setClipChildren(false);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
        this.LJLJI = userVerify;
        if (userVerify == null) {
            this.LJLIL.setController(null);
            this.LJLILLLLZI.setVisibility(8);
        } else {
            W5F LJII = W5U.LJII(C78939UyV.LJ(userVerify.getAvatarThumb()));
            int[] iArr = this.LJLJJLL;
            if (iArr != null) {
                LJII.LJIILIIL(iArr);
            }
            LJII.LJJIIJ = this.LJLIL;
            LJII.LIZIZ("Avatar");
            C16880lQ.LLJJJ(LJII);
            boolean z = true;
            if ((userVerify.getVerificationType() == null || (userVerify.getVerificationType().intValue() != 2 && userVerify.getVerificationType().intValue() != 3)) && TextUtils.isEmpty(userVerify.getEnterpriseVerifyReason()) && TextUtils.isEmpty(userVerify.getCustomVerify())) {
                z = false;
            }
            ImageView imageView = this.LJLILLLLZI;
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        setPlaceHolder(R.color.ao);
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dz, getContext());
        float LIZJ = KL2.LIZJ(getContext(), 0.5f);
        if (this.LJLIL.getHierarchy().LIZJ != null) {
            this.LJLIL.getHierarchy().LIZJ.LJFF = LJIIIIZZ;
            this.LJLIL.getHierarchy().LIZJ.LIZLLL(LIZJ);
        }
        setFailureImage(R.drawable.b0p);
    }

    public AP9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AP9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJI = (int) EF7.LIZIZ().getResources().getDimension(R.dimen.kl);
        this.LJLJJL = (int) KL2.LIZJ(EF7.LIZIZ(), 2.0f);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(getContext());
        this.LJLIL = smartAvatarImageView;
        smartAvatarImageView.getHierarchy().LJIJI(R.color.ao, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        addView(this.LJLIL, getAvatarLayoutParams());
        int verifyIconSize = getVerifyIconSize();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(verifyIconSize, verifyIconSize);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(getVerifyIconMarginEnd());
        ImageView imageView = new ImageView(getContext());
        this.LJLILLLLZI = imageView;
        try {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.bis));
        } catch (Resources.NotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJLILLLLZI.setVisibility(8);
        addView(this.LJLILLLLZI, layoutParams);
    }
}
