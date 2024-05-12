package X;

import Y.IDRunnableS85S0100000;
import Y.IDfS124S0200000;
import android.content.Context;
import android.os.Handler;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHasNameSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHouseInfoRequestTimeoutSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS480S0100000;

/* renamed from: X.0La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05900La extends LinearLayout {
    public final String LJLIL;
    public LiveEffect LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public boolean LJLJJI;
    public final ImageView LJLJJL;
    public boolean LJLJJLL;
    public final Handler LJLJL;
    public final IDRunnableS85S0100000 LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        Long l;
        String str;
        int i;
        String str2;
        Effect effect;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sticker_info_show");
        LIZ.LJIIZILJ();
        LiveEffect liveEffect = this.LJLILLLLZI;
        String str3 = null;
        if (liveEffect != null) {
            l = Long.valueOf(liveEffect.effectId);
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "sticker_id");
        LiveEffect liveEffect2 = this.LJLILLLLZI;
        if (liveEffect2 != null) {
            str = liveEffect2.getResourceId();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "resource_id");
        LiveEffect liveEffect3 = this.LJLILLLLZI;
        if (liveEffect3 != null) {
            str3 = liveEffect3.getName();
        }
        LIZ.LJIJJ(str3, "sticker_name");
        LiveEffect liveEffect4 = this.LJLILLLLZI;
        if (liveEffect4 != null && (effect = liveEffect4.getEffect()) != null) {
            i = effect.getSource();
        } else {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "source");
        if (this.LJLJJI) {
            str2 = "done";
        } else {
            str2 = "failed";
        }
        LIZ.LJIJJ(str2, "status");
        LIZ.LJJIIJZLJL();
    }

    public final void LIZLLL() {
        this.LJLJJL.clearAnimation();
        this.LJLJJL.setImageResource(R.drawable.cs0);
    }

    public final void LIZJ(final LiveEffect liveEffect) {
        boolean z;
        String name;
        final String designerId;
        this.LJLILLLLZI = liveEffect;
        if (liveEffect == null) {
            setVisibility(8);
            return;
        }
        this.LJLJJI = false;
        setVisibility(0);
        if (C79004UzY.LJJI(liveEffect)) {
            this.LJLJJL.setImageResource(R.drawable.csb);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(2000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.LJLJJL.startAnimation(rotateAnimation);
            this.LJLJL.removeCallbacks(this.LJLJLJ);
            this.LJLJL.postDelayed(this.LJLJLJ, LiveEffectHouseInfoRequestTimeoutSetting.INSTANCE.getTimeoutMs());
            final C48331v3 c48331v3 = new C48331v3(System.currentTimeMillis(), this, liveEffect);
            Effect effect = liveEffect.getEffect();
            if (effect == null || (designerId = effect.getDesignerId()) == null || designerId.length() == 0) {
                return;
            }
            ConcurrentHashMap<String, AnonymousClass018> concurrentHashMap = AnonymousClass019.LIZ;
            if (concurrentHashMap.containsKey(designerId)) {
                c48331v3.invoke(liveEffect, concurrentHashMap.get(designerId));
                return;
            } else {
                ((C29374Bfu) B83.LIZ().LIZIZ()).LJIILL(CastLongProtector.parseLong(designerId), "EffectHouseHelper_getUserInfoById").LJIJJ(C73969T1h.LIZIZ()).LJJII(new InterfaceC64592gB() { // from class: X.181
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        User user = (User) obj;
                        o.LJIIIZ(user, "user");
                        String str = designerId;
                        String LIZ = C05170If.LIZ(user);
                        o.LJIIIIZZ(LIZ, "getDisplayName(user)");
                        ImageModel avatarThumb = user.getAvatarThumb();
                        o.LJIIIIZZ(avatarThumb, "user.avatarThumb");
                        AnonymousClass018 anonymousClass018 = new AnonymousClass018(str, LIZ, avatarThumb);
                        AnonymousClass019.LIZ.put(designerId, anonymousClass018);
                        InterfaceC88471Ynr<LiveEffect, AnonymousClass018, C76800UCe> interfaceC88471Ynr = c48331v3;
                        if (interfaceC88471Ynr != null) {
                            interfaceC88471Ynr.invoke(liveEffect, anonymousClass018);
                        }
                    }
                }, new IDfS124S0200000(c48331v3, liveEffect, 0));
                return;
            }
        }
        Effect effect2 = liveEffect.getEffect();
        if (effect2 != null && effect2.getSource() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && LiveEffectHasNameSetting.INSTANCE.enable()) {
            this.LJLJJI = true;
            LIZLLL();
            if (C77412UZs.LJJ(liveEffect)) {
                name = liveEffect.parentResName;
            } else {
                name = liveEffect.getName();
            }
            if (name == null) {
                ((TextView) LIZ(R.id.cse)).setText(C15380j0.LJIILJJIL(R.string.kze));
            } else {
                ((TextView) LIZ(R.id.cse)).setText(C15380j0.LJIILL(R.string.kzf, BidiFormatter.getInstance(CCJ.LIZ(getContext())).unicodeWrap(name), BidiFormatter.getInstance(CCJ.LIZ(getContext())).unicodeWrap(this.LJLIL)));
            }
            ((CL0) LIZ(R.id.cse)).LJJIJLIJ();
            LIZIZ();
            return;
        }
        this.LJLJJI = true;
        LIZLLL();
        ((TextView) LIZ(R.id.cse)).setText(C15380j0.LJIILJJIL(R.string.kze));
        ((CL0) LIZ(R.id.cse)).LJJIJLIJ();
        LIZIZ();
    }

    public final void setClickListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJI = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05900La(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLLL = C62850Ola.LJFF(context, "context");
        this.LJLIL = "TikTok";
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
        this.LJLJLJ = new IDRunnableS85S0100000(this, 73);
        LinearLayout.inflate(context, R.layout.d2m, this);
        View findViewById = findViewById(R.id.kez);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.status_icon)");
        this.LJLJJL = (ImageView) findViewById;
        View effect_info_layout = LIZ(R.id.csd);
        o.LJIIIIZZ(effect_info_layout, "effect_info_layout");
        C16880lQ.LJIIJ(new IDaS480S0100000(this, 0), effect_info_layout);
    }
}
