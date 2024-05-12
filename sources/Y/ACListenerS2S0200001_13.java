package Y;

import X.BZI;
import X.C28787BRn;
import X.C56K;
import X.C76883UFj;
import X.C76889UFp;
import X.C76890UFq;
import X.C81091Vs7;
import X.EnumC76880UFg;
import X.UGS;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes14.dex */
public class ACListenerS2S0200001_13 implements View.OnClickListener {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS2S0200001_13 aCListenerS2S0200001_13, View view) {
        int i;
        int i2;
        EnumC76880UFg enumC76880UFg;
        Map<String, Object> map;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_emote_edit_page_add_rotate");
        C76883UFj c76883UFj = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0).LJLIL;
        if (c76883UFj != null && (map = c76883UFj.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
            }
        }
        LIZ.LJJIIJZLJL();
        EmoteEditDialogFragment emoteEditDialogFragment = (EmoteEditDialogFragment) aCListenerS2S0200001_13.l0;
        int i3 = 0;
        emoteEditDialogFragment.LLF = false;
        UGS ugs = (UGS) emoteEditDialogFragment._$_findCachedViewById(R.id.i24);
        if (ugs != null) {
            ugs.LIZIZ();
        }
        View _$_findCachedViewById = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.i24);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.postDelayed(new ARunnableS49S0100000_13((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0, 82), 5000L);
        }
        ((C81091Vs7) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12)).LJII();
        EmoteEditDialogFragment emoteEditDialogFragment2 = (EmoteEditDialogFragment) aCListenerS2S0200001_13.l0;
        emoteEditDialogFragment2.LJLILLLLZI = BitmapUtils.rotateBitmap(emoteEditDialogFragment2.LJLILLLLZI, 90);
        ((AppCompatImageView) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12)).setImageBitmap(((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0).LJLILLLLZI);
        Bitmap bitmap = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0).LJLILLLLZI;
        if (bitmap != null) {
            i = bitmap.getWidth();
        } else {
            i = 0;
        }
        Bitmap bitmap2 = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0).LJLILLLLZI;
        if (bitmap2 != null) {
            i3 = bitmap2.getHeight();
        }
        C76883UFj c76883UFj2 = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0).LJLIL;
        if (c76883UFj2 == null || (enumC76880UFg = c76883UFj2.LIZIZ) == null) {
            i2 = -1;
        } else {
            i2 = C76889UFp.LIZ[enumC76880UFg.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                EmoteEditDialogFragment emoteEditDialogFragment3 = (EmoteEditDialogFragment) aCListenerS2S0200001_13.l0;
                if (emoteEditDialogFragment3.LJLILLLLZI != null && i3 < i && i3 > 0 && emoteEditDialogFragment3.LJLZ > 0) {
                    C81091Vs7 c81091Vs7 = (C81091Vs7) emoteEditDialogFragment3._$_findCachedViewById(R.id.f12);
                    if (c81091Vs7 != null) {
                        c81091Vs7.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C81091Vs7 c81091Vs72 = (C81091Vs7) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (c81091Vs72 != null) {
                        c81091Vs72.LJIIJ(1L);
                    }
                    View _$_findCachedViewById2 = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (_$_findCachedViewById2 != null) {
                        _$_findCachedViewById2.postDelayed(new ARunnableS32S0200000_13((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0, (C56K) aCListenerS2S0200001_13.l1, 38), 50L);
                    }
                }
            } else {
                EmoteEditDialogFragment emoteEditDialogFragment4 = (EmoteEditDialogFragment) aCListenerS2S0200001_13.l0;
                if (emoteEditDialogFragment4.LJLILLLLZI != null && i3 < i && i3 > 0 && emoteEditDialogFragment4.LJLZ > 0) {
                    C81091Vs7 c81091Vs73 = (C81091Vs7) emoteEditDialogFragment4._$_findCachedViewById(R.id.f12);
                    if (c81091Vs73 != null) {
                        c81091Vs73.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C81091Vs7 c81091Vs74 = (C81091Vs7) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (c81091Vs74 != null) {
                        c81091Vs74.LJIIJ(1L);
                    }
                    View _$_findCachedViewById3 = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (_$_findCachedViewById3 != null) {
                        _$_findCachedViewById3.postDelayed(new ARunnableS32S0200000_13((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0, (C56K) aCListenerS2S0200001_13.l1, 37), 50L);
                    }
                } else {
                    C81091Vs7 c81091Vs75 = (C81091Vs7) emoteEditDialogFragment4._$_findCachedViewById(R.id.f12);
                    if (c81091Vs75 != null) {
                        c81091Vs75.LJIIIZ(new PointF(0.0f, aCListenerS2S0200001_13.f2), 1.0f, 1.0f, new PointF(0.0f, 0.0f));
                    }
                    C81091Vs7 c81091Vs76 = (C81091Vs7) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (c81091Vs76 != null) {
                        c81091Vs76.LJIIJ(null);
                    }
                }
            }
        } else {
            C81091Vs7 c81091Vs77 = (C81091Vs7) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs77 != null) {
                c81091Vs77.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
            }
            C81091Vs7 c81091Vs78 = (C81091Vs7) ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs78 != null) {
                c81091Vs78.LJIIJ(1L);
            }
        }
        View _$_findCachedViewById4 = ((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
        if (_$_findCachedViewById4 != null) {
            _$_findCachedViewById4.postDelayed(new ARunnableS49S0100000_13((EmoteEditDialogFragment) aCListenerS2S0200001_13.l0, 83), 100L);
        }
    }

    public static final void onClick$1(ACListenerS2S0200001_13 aCListenerS2S0200001_13, View view) {
        int i;
        int i2;
        EnumC76880UFg enumC76880UFg;
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = (SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_rotate_click");
        spotlightImageEditDialogFragment.Gl(LIZ);
        LIZ.LJIJJ(spotlightImageEditDialogFragment.LLFII, "show_entrance");
        LIZ.LJJIIJZLJL();
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment2 = (SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0;
        int i3 = 0;
        spotlightImageEditDialogFragment2.LLD = false;
        UGS ugs = (UGS) spotlightImageEditDialogFragment2._$_findCachedViewById(R.id.i24);
        if (ugs != null) {
            ugs.LIZIZ();
        }
        View _$_findCachedViewById = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.i24);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.postDelayed(new ARunnableS49S0100000_13((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0, 87), 5000L);
        }
        ((C81091Vs7) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12)).LJII();
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment3 = (SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0;
        spotlightImageEditDialogFragment3.LJLILLLLZI = BitmapUtils.rotateBitmap(spotlightImageEditDialogFragment3.LJLILLLLZI, 90);
        ((AppCompatImageView) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12)).setImageBitmap(((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0).LJLILLLLZI);
        Bitmap bitmap = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0).LJLILLLLZI;
        if (bitmap != null) {
            i = bitmap.getWidth();
        } else {
            i = 0;
        }
        Bitmap bitmap2 = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0).LJLILLLLZI;
        if (bitmap2 != null) {
            i3 = bitmap2.getHeight();
        }
        C76883UFj c76883UFj = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0).LJLIL;
        if (c76883UFj == null || (enumC76880UFg = c76883UFj.LIZIZ) == null) {
            i2 = -1;
        } else {
            i2 = C76890UFq.LIZ[enumC76880UFg.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                SpotlightImageEditDialogFragment spotlightImageEditDialogFragment4 = (SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0;
                if (spotlightImageEditDialogFragment4.LJLILLLLZI != null && i3 < i && i3 > 0 && spotlightImageEditDialogFragment4.LJLZ > 0) {
                    C81091Vs7 c81091Vs7 = (C81091Vs7) spotlightImageEditDialogFragment4._$_findCachedViewById(R.id.f12);
                    if (c81091Vs7 != null) {
                        c81091Vs7.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C81091Vs7 c81091Vs72 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (c81091Vs72 != null) {
                        c81091Vs72.LJIIJ(1L);
                    }
                    View _$_findCachedViewById2 = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (_$_findCachedViewById2 != null) {
                        _$_findCachedViewById2.postDelayed(new ARunnableS32S0200000_13((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0, (C56K) aCListenerS2S0200001_13.l1, 42), 50L);
                    }
                }
            } else {
                SpotlightImageEditDialogFragment spotlightImageEditDialogFragment5 = (SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0;
                if (spotlightImageEditDialogFragment5.LJLILLLLZI != null && i3 < i && i3 > 0 && spotlightImageEditDialogFragment5.LJLZ > 0) {
                    C81091Vs7 c81091Vs73 = (C81091Vs7) spotlightImageEditDialogFragment5._$_findCachedViewById(R.id.f12);
                    if (c81091Vs73 != null) {
                        c81091Vs73.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C81091Vs7 c81091Vs74 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (c81091Vs74 != null) {
                        c81091Vs74.LJIIJ(1L);
                    }
                    View _$_findCachedViewById3 = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (_$_findCachedViewById3 != null) {
                        _$_findCachedViewById3.postDelayed(new ARunnableS32S0200000_13((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0, (C56K) aCListenerS2S0200001_13.l1, 41), 50L);
                    }
                } else {
                    C81091Vs7 c81091Vs75 = (C81091Vs7) spotlightImageEditDialogFragment5._$_findCachedViewById(R.id.f12);
                    if (c81091Vs75 != null) {
                        c81091Vs75.LJIIIZ(new PointF(0.0f, aCListenerS2S0200001_13.f2), 1.0f, 1.0f, new PointF(0.0f, 0.0f));
                    }
                    C81091Vs7 c81091Vs76 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
                    if (c81091Vs76 != null) {
                        c81091Vs76.LJIIJ(null);
                    }
                }
            }
        } else {
            C81091Vs7 c81091Vs77 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs77 != null) {
                c81091Vs77.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
            }
            C81091Vs7 c81091Vs78 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs78 != null) {
                c81091Vs78.LJIIJ(1L);
            }
        }
        View _$_findCachedViewById4 = ((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0)._$_findCachedViewById(R.id.f12);
        if (_$_findCachedViewById4 != null) {
            _$_findCachedViewById4.postDelayed(new ARunnableS49S0100000_13((SpotlightImageEditDialogFragment) aCListenerS2S0200001_13.l0, 88), 100L);
        }
    }

    public ACListenerS2S0200001_13(Object obj, float f, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f2 = f;
        this.l1 = obj2;
    }
}
