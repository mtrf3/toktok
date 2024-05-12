package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.views.IDlS65S0100000_14;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VzN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81541VzN extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final InterfaceC84498XEg LJLILLLLZI;
    public final InterfaceC81543VzP LJLJI;
    public final C81232VuO LJLJJI;
    public StickerWrapper LJLJJL;

    public final void M(StickerWrapper stickerWrapper) {
        C81232VuO c81232VuO = this.LJLJJI;
        int i = stickerWrapper.mState;
        int i2 = stickerWrapper.downloadProgress;
        C81233VuP c81233VuP = c81232VuO.LJLIL;
        if (c81233VuP != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return;
                            }
                            ImageView imageView = c81233VuP.LJLJJI;
                            if (imageView != null) {
                                imageView.setVisibility(4);
                                C5EP c5ep = c81233VuP.LJLJJL;
                                if (c5ep != null) {
                                    if (c5ep.getVisibility() != 0) {
                                        C5EP c5ep2 = c81233VuP.LJLJJL;
                                        if (c5ep2 != null) {
                                            c5ep2.setVisibility(0);
                                        } else {
                                            o.LJIJI("progressView");
                                            throw null;
                                        }
                                    }
                                    C5EP c5ep3 = c81233VuP.LJLJJL;
                                    if (c5ep3 != null) {
                                        c5ep3.setProgress(i2);
                                        return;
                                    } else {
                                        o.LJIJI("progressView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("progressView");
                                throw null;
                            }
                            o.LJIJI("downloadImg");
                            throw null;
                        }
                        ImageView imageView2 = c81233VuP.LJLJJI;
                        if (imageView2 != null) {
                            imageView2.setVisibility(4);
                            C5EP c5ep4 = c81233VuP.LJLJJL;
                            if (c5ep4 != null) {
                                c5ep4.setVisibility(4);
                                return;
                            } else {
                                o.LJIJI("progressView");
                                throw null;
                            }
                        }
                        o.LJIJI("downloadImg");
                        throw null;
                    }
                    if (c81233VuP.LJLJJLL) {
                        ImageView imageView3 = c81233VuP.LJLJJI;
                        if (imageView3 != null) {
                            imageView3.setVisibility(0);
                        } else {
                            o.LJIJI("downloadImg");
                            throw null;
                        }
                    } else {
                        ImageView imageView4 = c81233VuP.LJLJJI;
                        if (imageView4 != null) {
                            imageView4.setVisibility(4);
                        } else {
                            o.LJIJI("downloadImg");
                            throw null;
                        }
                    }
                    C5EP c5ep5 = c81233VuP.LJLJJL;
                    if (c5ep5 != null) {
                        c5ep5.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("progressView");
                        throw null;
                    }
                }
                ImageView imageView5 = c81233VuP.LJLJJI;
                if (imageView5 != null) {
                    imageView5.setVisibility(4);
                    C5EP c5ep6 = c81233VuP.LJLJJL;
                    if (c5ep6 != null) {
                        c5ep6.setVisibility(0);
                        C5EP c5ep7 = c81233VuP.LJLJJL;
                        if (c5ep7 != null) {
                            c5ep7.setProgress(0);
                            return;
                        } else {
                            o.LJIJI("progressView");
                            throw null;
                        }
                    }
                    o.LJIJI("progressView");
                    throw null;
                }
                o.LJIJI("downloadImg");
                throw null;
            }
            ImageView imageView6 = c81233VuP.LJLJJI;
            if (imageView6 != null) {
                imageView6.setVisibility(4);
                C5EP c5ep8 = c81233VuP.LJLJJL;
                if (c5ep8 != null) {
                    c5ep8.setVisibility(4);
                    return;
                } else {
                    o.LJIJI("progressView");
                    throw null;
                }
            }
            o.LJIJI("downloadImg");
            throw null;
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final void N(boolean z) {
        StickerWrapper stickerWrapper = this.LJLJJL;
        if (stickerWrapper != null) {
            int i = stickerWrapper.mState;
            if (i == 2) {
                return;
            }
            if (i == 1) {
                this.LJLJJI.LJ(true);
                this.LJLJI.LJJLIIIJ(getAdapterPosition(), z);
                this.LJLJJI.LJ(true);
                return;
            } else {
                Effect effect = stickerWrapper.mEffect;
                o.LJIIIIZZ(effect, "duetLayoutEffect.effect");
                this.LJLILLLLZI.fetchEffect(effect, new C81542VzO(this, z));
                return;
            }
        }
        o.LJIJI("duetLayoutEffect");
        throw null;
    }

    public final void L(StickerWrapper stickerWrapper, boolean z) {
        int i;
        UrlModel iconUrl;
        List<String> urlList;
        String str;
        o.LJIIIZ(stickerWrapper, "stickerWrapper");
        this.LJLJJL = stickerWrapper;
        Effect effect = stickerWrapper.mEffect;
        if (effect == null) {
            return;
        }
        InterfaceC84498XEg interfaceC84498XEg = this.LJLILLLLZI;
        if (interfaceC84498XEg == null || !C30591Hz.LJII(effect, interfaceC84498XEg)) {
            i = 3;
        } else {
            i = 1;
        }
        stickerWrapper.mState = i;
        M(stickerWrapper);
        Effect effect2 = stickerWrapper.mEffect;
        if (effect2 != null && (iconUrl = effect2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ListProtector.get(urlList, 0)) != null) {
            this.LJLJJI.LIZLLL(str);
        }
        this.LJLJJI.LJ(false);
        this.LJLJJI.setText(stickerWrapper.mEffect.getName());
        if (z) {
            N(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81541VzN(View view, InterfaceC84498XEg effectPlatform, InterfaceC81543VzP onItemClickListener) {
        super(view);
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = view;
        this.LJLILLLLZI = effectPlatform;
        this.LJLJI = onItemClickListener;
        View findViewById = view.findViewById(R.id.gl6);
        o.LJIIIIZZ(findViewById, "parent.findViewById(R.id.mode_img_view)");
        this.LJLJJI = (C81232VuO) findViewById;
        C16880lQ.LJIIJ(new IDlS65S0100000_14(this, 9), this.itemView);
    }
}
