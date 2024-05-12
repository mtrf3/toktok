package X;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import v82.IDdS501S0100000_8;

/* loaded from: classes9.dex */
public final class JIZ extends JJW {
    public final Object LJLIL;
    public final C73044Slc LJLILLLLZI;
    public IQ9 LJLJI;
    public Aweme LJLJJI;
    public boolean LJLJJL;

    @Override // X.JJW
    public final void onViewAttachedToWindow() {
        this.LJLILLLLZI.LJIIJ();
        IQ9 iq9 = this.LJLJI;
        if (iq9 != null) {
            iq9.LIZLLL(this.LJLILLLLZI);
        } else {
            o.LJIJI("playerController");
            throw null;
        }
    }

    @Override // X.JJW
    public final void onViewDetachedFromWindow() {
        IQ9 iq9 = this.LJLJI;
        if (iq9 != null) {
            iq9.pause();
            IQ9 iq92 = this.LJLJI;
            if (iq92 != null) {
                C73044Slc uiPlayListener = this.LJLILLLLZI;
                o.LJIIIZ(uiPlayListener, "uiPlayListener");
                if (iq92.LJ().contains(uiPlayListener)) {
                    iq92.LJ().remove(uiPlayListener);
                    return;
                }
                return;
            }
            o.LJIJI("playerController");
            throw null;
        }
        o.LJIJI("playerController");
        throw null;
    }

    @Override // X.JJW
    public final void L(JJZ jjz) {
        View findViewById = this.itemView.findViewById(R.id.player_view);
        o.LJIIIIZZ(findViewById, "itemView.player_view");
        findViewById.setVisibility(8);
        KJR kjr = (KJR) jjz;
        Aweme LIZIZ = kjr.LIZIZ();
        this.LJLJJI = LIZIZ;
        IQ9 iq9 = kjr.LJIIIIZZ;
        if (iq9 == null) {
            return;
        }
        this.LJLJI = iq9;
        Video video = LIZIZ.getVideo();
        if (video != null) {
            IQ9 iq92 = this.LJLJI;
            if (iq92 != null) {
                if (iq92.LIZJ == null) {
                    iq92.LIZJ = video;
                    iq92.LIZLLL = 0;
                    Aweme aweme = this.LJLJJI;
                    IWF iwf = iq92.LJFF;
                    if (iwf != null) {
                        iwf.LJJIZ(aweme, null);
                    }
                }
                ((TextureView) this.LJLILLLLZI.LJ(R.id.n8n)).setSurfaceTextureListener(new IS7(this));
                W5F LJII = W5U.LJII(C78939UyV.LJ(video.getCover()));
                LJII.LIZJ = this.itemView.getContext();
                LJII.LJIJI = Bitmap.Config.ARGB_8888;
                LJII.LJIIIZ(new IDdS501S0100000_8(this, 0));
                C73044Slc c73044Slc = this.LJLILLLLZI;
                c73044Slc.setVideoSize(new C73043Slb(video.getWidth(), video.getHeight()));
                c73044Slc.setVideoLength(video.getVideoLength());
                IQ9 iq93 = this.LJLJI;
                if (iq93 != null) {
                    c73044Slc.setPlayer(iq93);
                    return;
                } else {
                    o.LJIJI("playerController");
                    throw null;
                }
            }
            o.LJIJI("playerController");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JIZ(C71510S4s c71510S4s, Object container) {
        super(c71510S4s);
        o.LJIIIZ(container, "container");
        this.LJLIL = container;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c71510S4s.LJZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.hst));
        if (view == null) {
            view = c71510S4s.findViewById(R.id.hst);
            if (view != null) {
                linkedHashMap.put(Integer.valueOf(R.id.hst), view);
            } else {
                view = null;
            }
        }
        C73044Slc c73044Slc = (C73044Slc) view;
        o.LJIIIIZZ(c73044Slc, "itemView.player_view_v2");
        this.LJLILLLLZI = c73044Slc;
        this.LJLJJL = true;
    }
}
