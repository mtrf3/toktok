package X;

import Y.ACListenerS48S0200000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WdV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82733WdV extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJZL = 0;
    public final C145255mz LJLIL;
    public final InterfaceC82734WdW LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final C29701Eo LJLJJL;
    public final View LJLJJLL;
    public final C81232VuO LJLJL;
    public final TextView LJLJLJ;
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public final TextView LJLLI;
    public final TextView LJLLILLLL;
    public final View LJLLJ;
    public final ImageView LJLLL;
    public final SY4 LJLLLL;
    public final IMusicService LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public boolean LJZI;

    public static void N(C81232VuO c81232VuO) {
        c81232VuO.LIZ(c81232VuO.getContext().getDrawable(R.drawable.b0n));
        C81233VuP c81233VuP = c81232VuO.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setBackground(c81232VuO.LLII);
        } else {
            o.LJIJI("imageView");
            throw null;
        }
    }

    public final boolean M(MusicModel musicModel) {
        List<MusicTag> musicTags;
        String str;
        MusicTag musicTag;
        if (!this.LJLJJI || (musicTags = musicModel.getMusicTags()) == null || musicTags.isEmpty()) {
            return false;
        }
        List<MusicTag> musicTags2 = musicModel.getMusicTags();
        if (musicTags2 != null && (musicTag = (MusicTag) ORZ.LJLLLL(musicTags2)) != null) {
            str = musicTag.getTagTitle();
        } else {
            str = null;
        }
        if (!C78685UuP.LJJJZ(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x014b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82733WdV.L(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82733WdV(C145255mz musicPanelViewHolderParam, View view, InterfaceC82734WdW callBackListener, boolean z, boolean z2) {
        super(view);
        int i;
        o.LJIIIZ(musicPanelViewHolderParam, "musicPanelViewHolderParam");
        o.LJIIIZ(callBackListener, "callBackListener");
        this.LJLIL = musicPanelViewHolderParam;
        this.LJLILLLLZI = callBackListener;
        this.LJLJI = z;
        this.LJLJJI = z2;
        IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        o.LJIIIIZZ(LJJLIIIJJI, "get().getService(IMusicService::class.java)");
        this.LJLLLLLL = LJJLIIIJJI;
        C81232VuO c81232VuO = (C81232VuO) view.findViewById(R.id.eu7);
        this.LJLJL = c81232VuO;
        this.LJLJLJ = (TextView) view.findViewById(R.id.mbm);
        this.LJLJLLL = (TextView) view.findViewById(R.id.mkb);
        this.LJLL = (TextView) view.findViewById(R.id.mbs);
        this.LJLLI = (TextView) view.findViewById(R.id.title);
        this.LJLLILLLL = (TextView) view.findViewById(R.id.m04);
        ImageView imageView = (ImageView) view.findViewById(R.id.bh1);
        this.LJLLL = imageView;
        View findViewById = view.findViewById(R.id.c2v);
        this.LJLLJ = findViewById;
        SY4 sy4 = (SY4) view.findViewById(R.id.evf);
        this.LJLLLL = sy4;
        if (QXF.LIZLLL()) {
            C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.ga7);
            this.LJLJJL = c29701Eo;
            if (c29701Eo != null) {
                c29701Eo.setAnimation("little_audio_wave_anim.json");
                c29701Eo.setRepeatCount(-1);
            }
            this.LJLJJLL = view.findViewById(R.id.n3o);
            if (c81232VuO != null) {
                Integer LIZIZ = C19N.LIZIZ(view, "itemView.context", R.attr.dj);
                if (LIZIZ != null) {
                    i = LIZIZ.intValue();
                } else {
                    i = 0;
                }
                c81232VuO.setClickStatusColor(i);
            }
        }
        if (C58B.LIZ() && sy4 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = C61328O5c.LIZJ(5);
            Context context = sy4.getContext();
            o.LJIIIIZZ(context, "it.context");
            sy4.setBackground(c110614Vt.LIZ(context));
        }
        C16880lQ.LJIIJ(new ACListenerS48S0200000_14(this, view, 7), view);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS48S0200000_14(this, view, 8), findViewById);
        }
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS48S0200000_14(this, view, 9));
        }
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS48S0200000_14(this, view, 10));
        }
        if (((Number) L1D.LIZ.getValue()).intValue() == 3 || L1D.LIZ()) {
            int LIZJ = (int) KL2.LIZJ(view.getContext(), 10.0f);
            int LIZJ2 = (int) KL2.LIZJ(view.getContext(), 44.0f);
            int LIZJ3 = (int) KL2.LIZJ(view.getContext(), 44.0f);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = LIZJ2;
                }
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = LIZJ3;
                }
                findViewById.setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
            }
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = LIZJ2;
                }
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = LIZJ3;
                }
                imageView.setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
            }
            C82740Wdc.LIZIZ(findViewById);
            C82740Wdc.LIZIZ(imageView);
        }
    }
}
