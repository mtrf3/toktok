package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55891Lwd extends AbstractC70683Rod {
    public final java.util.Map<Integer, View> LJLIL;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractC70683Rod
    public int getLayoutResId() {
        return R.layout.a6f;
    }

    @Override // X.AbstractC70683Rod
    public SmartAvatarImageView getIvAvatar() {
        SmartAvatarImageView avatar = (SmartAvatarImageView) _$_findCachedViewById(R.id.abh);
        o.LJIIIIZZ(avatar, "avatar");
        return avatar;
    }

    @Override // X.AbstractC70683Rod
    public LTF getRsStar() {
        LTF star = (LTF) _$_findCachedViewById(R.id.kbs);
        o.LJIIIIZZ(star, "star");
        return star;
    }

    @Override // X.AbstractC70683Rod
    public TuxTextView getTvSku() {
        TuxTextView sku = (TuxTextView) _$_findCachedViewById(R.id.k2o);
        o.LJIIIIZZ(sku, "sku");
        return sku;
    }

    @Override // X.AbstractC70683Rod
    public TuxTextView getTvUserName() {
        TuxTextView username = (TuxTextView) _$_findCachedViewById(R.id.n1a);
        o.LJIIIIZZ(username, "username");
        return username;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55891Lwd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55891Lwd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = C62850Ola.LJFF(context, "context");
    }
}
