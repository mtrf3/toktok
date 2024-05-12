package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141455gr extends C8HS<C141225gU> {
    public final InterfaceC141035gB LJLIL;
    public final C141205gS LJLILLLLZI;
    public int LJLJI;

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141455gr(InterfaceC141035gB onItemClickListener, C141205gS dataManager) {
        super(false, 1, null);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        o.LJIIIZ(dataManager, "dataManager");
        this.LJLIL = onItemClickListener;
        this.LJLILLLLZI = dataManager;
        this.LJLJI = -1;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<T> list;
        C141225gU c141225gU;
        boolean z;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (!(viewHolder instanceof C141465gs) || (list = this.mmItems) == 0 || (c141225gU = (C141225gU) ORZ.LJLLLLLL(i, list)) == null) {
            return;
        }
        C141465gs c141465gs = (C141465gs) viewHolder;
        c141465gs.LJLJJL = c141225gU;
        SoundEffect soundEffect = c141225gU.LJLIL;
        TuxTextView tuxTextView = c141465gs.LJLJLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(soundEffect.musicName);
            TuxTextView tuxTextView2 = c141465gs.LJLJLLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(C78605Ut7.LJIIL(Math.max(1, soundEffect.duration) * 1000));
                TuxIconView tuxIconView = c141465gs.LJLLI;
                if (tuxIconView != null) {
                    C2068389v c2068389v = new C2068389v();
                    C141205gS c141205gS = c141465gs.LJLJJI;
                    String id = V1B.LJJLIIIJLLLLLLLZ(soundEffect);
                    c141205gS.getClass();
                    o.LJIIIZ(id, "id");
                    Boolean bool = c141205gS.LIZJ.get(id);
                    if (bool == null || !bool.booleanValue()) {
                        c2068389v.LIZ = R.raw.icon_bookmark;
                    } else {
                        c2068389v.LIZ = R.raw.icon_bookmark_fill;
                    }
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    if (c141225gU.LJLILLLLZI == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c141465gs.M(z);
                    int i2 = c141225gU.LJLJJI;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                c141465gs.M(false);
                            } else {
                                c141465gs.L().setLoading(false);
                                c141465gs.L().setText(c141465gs.itemView.getContext().getString(R.string.q63));
                            }
                        } else {
                            c141465gs.L().setLoading(false);
                            c141465gs.L().setText(c141465gs.itemView.getContext().getString(R.string.fnv));
                        }
                    } else {
                        c141465gs.L().setLoading(true);
                    }
                    if (c141225gU.LJLJI == 3) {
                        C29701Eo c29701Eo = c141465gs.LJLLILLLL;
                        if (c29701Eo != null) {
                            c29701Eo.setVisibility(0);
                            c29701Eo.setAnimation("little_audio_wave_anim.json");
                            c29701Eo.setRepeatCount(-1);
                            c29701Eo.playAnimation();
                            TuxIconView tuxIconView2 = c141465gs.LJLJL;
                            if (tuxIconView2 != null) {
                                tuxIconView2.setVisibility(4);
                            } else {
                                o.LJIJI("soundIcon");
                                throw null;
                            }
                        } else {
                            o.LJIJI("animWaveView");
                            throw null;
                        }
                    } else {
                        C29701Eo c29701Eo2 = c141465gs.LJLLILLLL;
                        if (c29701Eo2 != null) {
                            c29701Eo2.pauseAnimation();
                            C29701Eo c29701Eo3 = c141465gs.LJLLILLLL;
                            if (c29701Eo3 != null) {
                                c29701Eo3.setVisibility(4);
                                TuxIconView tuxIconView3 = c141465gs.LJLJL;
                                if (tuxIconView3 != null) {
                                    tuxIconView3.setVisibility(0);
                                } else {
                                    o.LJIJI("soundIcon");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("animWaveView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("animWaveView");
                            throw null;
                        }
                    }
                    c141465gs.LJLJI.LIZIZ(c141465gs.LJLILLLLZI, new OSZ<>(Integer.valueOf(c141465gs.LJLIL), Integer.valueOf(c141465gs.getBindingAdapterPosition())), c141225gU);
                    return;
                }
                o.LJIJI("collectButton");
                throw null;
            }
            o.LJIJI("totalTimeTv");
            throw null;
        }
        o.LJIJI("titleTv");
        throw null;
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.jg, viewGroup, false);
        int i2 = this.LJLJI;
        o.LJIIIIZZ(view, "view");
        return new C141465gs(i2, view, this.LJLIL, this.LJLILLLLZI);
    }
}
