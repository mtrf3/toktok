package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32131Nx extends AbstractC029409q<C32121Nw> {
    public final DataChannel LJLIL;
    public final VoiceEffectViewModel LJLILLLLZI;
    public final List<LiveEffect> LJLJI;
    public final java.util.Map<Long, Integer> LJLJJI;
    public LiveEffect LJLJJL;
    public LiveEffect LJLJJLL;
    public boolean LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public C32131Nx(DataChannel dataChannel, VoiceEffectViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = viewModel;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C2DQ(this, null), 3);
        this.LJLJI = new ArrayList();
        this.LJLJJI = new LinkedHashMap();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C32121Nw c32121Nw, int i) {
        int i2;
        final C32121Nw viewholer = c32121Nw;
        o.LJIIIZ(viewholer, "viewholer");
        final LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LJLJI, i);
        final boolean LIZJ = C32141Ny.LIZJ(liveEffect);
        final boolean iv0 = this.LJLILLLLZI.iv0(liveEffect);
        UrlModel urlModel = liveEffect.icon;
        boolean z = false;
        if (urlModel != null) {
            C15640jQ.LJ(viewholer.LJLIL, urlModel.L(), 0);
        }
        viewholer.LJLJJL.setText(liveEffect.getName());
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect2 = this.LJLJJLL;
        if (liveEffect2 != null) {
            c30522ByQ.getClass();
            boolean LIZ = C30522ByQ.LIZ(liveEffect2, liveEffect);
            C47121t6 c47121t6 = viewholer.LJLJJL;
            if (LIZ) {
                i2 = R.color.c0;
            } else {
                i2 = R.color.bc;
            }
            c47121t6.setTextColor(C15380j0.LIZIZ(i2));
            C29306Beo.LJJLIIIJJI(viewholer.LJLJL, LIZ);
            if (LIZ) {
                viewholer.LJLJJL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                viewholer.LJLJJL.setSelected(true);
            } else {
                viewholer.LJLJJL.setEllipsize(TextUtils.TruncateAt.END);
                viewholer.LJLJJL.setSelected(false);
            }
            C29306Beo.LJI(viewholer.LJLJJLL);
            VoiceEffectViewModel voiceEffectViewModel = this.LJLILLLLZI;
            voiceEffectViewModel.getClass();
            if (voiceEffectViewModel.LJLIL.LJLIL.contains(liveEffect)) {
                C29306Beo.LJJLJLI(viewholer.LJLJJI);
                C29306Beo.LJI(viewholer.LJLJI);
            } else {
                C29306Beo.LJI(viewholer.LJLJJI);
                View view = viewholer.LJLJI;
                if (!LIZJ && !iv0) {
                    z = true;
                }
                C29306Beo.LJJLIIIJJI(view, z);
            }
            ConstraintLayout constraintLayout = viewholer.LJLILLLLZI;
            C29306Beo.LJJJLL(constraintLayout, 500L, new C50471yV(viewholer.getAdapterPosition(), this, liveEffect, LIZJ, iv0, viewholer));
            constraintLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Wt
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    C30522ByQ c30522ByQ2 = LiveEffect.Companion;
                    LiveEffect liveEffect3 = C32131Nx.this.LJLJJLL;
                    if (liveEffect3 != null) {
                        LiveEffect liveEffect4 = liveEffect;
                        c30522ByQ2.getClass();
                        if (!C30522ByQ.LIZ(liveEffect3, liveEffect4) || LIZJ || !iv0) {
                            return false;
                        }
                        C32131Nx.this.LJLJL = true;
                        C32121Nw c32121Nw2 = viewholer;
                        C29306Beo.LJJLIIIJJI(c32121Nw2.LJLJJLL, true);
                        ViewParent parent = c32121Nw2.LJLJLJ.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        C32141Ny.LJIIJ = true;
                        IAudioStrangeVoice iAudioStrangeVoice = C32141Ny.LIZJ;
                        if (iAudioStrangeVoice != null) {
                            iAudioStrangeVoice.enablePlayerMode(true, LiveVoiceEffectUseVoipModeSetting.INSTANCE.getValue());
                        }
                        InterfaceC08970Wv interfaceC08970Wv = C32141Ny.LJII;
                        if (interfaceC08970Wv != null) {
                            interfaceC08970Wv.D2(true);
                        }
                        DataChannel dataChannel = C32131Nx.this.LJLIL;
                        LiveEffect liveEffect5 = liveEffect;
                        o.LJIIIZ(liveEffect5, "liveEffect");
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_voice_try");
                        LIZ2.LJIILLIIL(dataChannel);
                        LIZ2.LJIJJ(liveEffect5.nameForEnglish, "effect_name");
                        LIZ2.LJIJJ(Long.valueOf(liveEffect5.effectId), "effect_id");
                        LIZ2.LJIJJ(liveEffect5.getResourceId(), "resource_id");
                        LIZ2.LJJIIJZLJL();
                        return true;
                    }
                    o.LJIJI("selectSoundEffect");
                    throw null;
                }
            });
            constraintLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Wu
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            return false;
                        }
                        C32131Nx c32131Nx = C32131Nx.this;
                        if (c32131Nx.LJLJL) {
                            C32141Ny.LIZ();
                            c32131Nx.LJLJL = false;
                            C32121Nw c32121Nw2 = viewholer;
                            C29306Beo.LJJLIIIJJI(c32121Nw2.LJLJJLL, false);
                            ViewParent parent = c32121Nw2.LJLJLJ.getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        }
                        return false;
                    }
                    C32131Nx c32131Nx2 = C32131Nx.this;
                    if (!c32131Nx2.LJLJL) {
                        return false;
                    }
                    C32141Ny.LIZ();
                    c32131Nx2.LJLJL = false;
                    C32131Nx.this.notifyDataSetChanged();
                    return true;
                }
            });
            return;
        }
        o.LJIJI("selectSoundEffect");
        throw null;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C32121Nw com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup view, int i) {
        o.LJIIIZ(view, "view");
        C32121Nw c32121Nw = new C32121Nw(C1FL.LIZIZ(view, R.layout.d2s, view, false, "from(view.context)\n     …oice_effect, view, false)"));
        C0AX.LIZ(view, c32121Nw.itemView, R.id.lj7);
        View view2 = c32121Nw.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(view));
        }
        try {
            if (c32121Nw.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C32121Nw.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(view.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c32121Nw.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c32121Nw.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C32121Nw.class.getName();
        return c32121Nw;
    }
}
