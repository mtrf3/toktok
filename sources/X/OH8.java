package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S18S0200000_10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OH8 implements OHA {
    public final MusicDetail LIZ;
    public C74402w0 LIZIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZJ;

    @Override // X.OHA
    public final void LIZ(C252709vu c252709vu) {
        MusicResourceBitStruct musicResourceBitStruct;
        String mid;
        Context context = this.LIZJ.getContext();
        if (context == null || (musicResourceBitStruct = this.LIZ.musicResourceBitStruct) == null) {
            return;
        }
        String scene = musicResourceBitStruct.getScene();
        String str = "";
        if (scene == null) {
            scene = "";
        }
        Music music = this.LIZ.music;
        if (music != null && (mid = music.getMid()) != null) {
            str = mid;
        }
        String schema = musicResourceBitStruct.getSchema();
        if (schema == null || schema.length() == 0) {
            return;
        }
        C235929Ns c235929Ns = new C235929Ns();
        c235929Ns.LIZIZ = "rewarded_music";
        C74402w0 c74402w0 = new C74402w0(context);
        List<String> channels = musicResourceBitStruct.getChannels();
        ArrayList arrayList = new ArrayList();
        if (channels != null) {
            for (String str2 : channels) {
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(str2));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setLazyUpdate(true);
                String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
                C61520OCm LIZ = O3E.LIZ(accessKey);
                if (LIZ != null) {
                    LIZ.LIZ(null, C51029K0z.LJJIIZI(new OSZ(accessKey, arrayList)), optionCheckUpdateParams);
                }
            } catch (Throwable unused) {
            }
        }
        String icon = musicResourceBitStruct.getIcon();
        if (icon == null || icon.length() == 0) {
            C62846OlW c62846OlW = c74402w0.LJLILLLLZI;
            if (c62846OlW != null) {
                C79146V4k.LJJIJLIJ(c62846OlW);
            }
        } else {
            C62846OlW c62846OlW2 = c74402w0.LJLILLLLZI;
            if (c62846OlW2 != null) {
                C78765Uvh.LJIIIZ(c62846OlW2, icon, -1, -1);
                C79146V4k.LJJLIIIJLJLI(c62846OlW2);
            }
        }
        TuxTextView tuxTextView = c74402w0.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(musicResourceBitStruct.getDesc());
        }
        List<String> colors = musicResourceBitStruct.getColors();
        ArrayList arrayList2 = new ArrayList();
        if (colors != null) {
            Iterator<String> it = colors.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(ColorProtector.parseColor(it.next())));
            }
        }
        if (!arrayList2.isEmpty()) {
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            LIZIZ.setCornerRadius(C32151Nz.LJIIZILJ(27));
            LIZIZ.setGradientType(0);
            LIZIZ.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            LIZIZ.setColors(ORZ.LLJ(arrayList2));
            View view = c74402w0.LJLIL;
            if (view != null) {
                view.setBackground(LIZIZ);
            }
        }
        c235929Ns.LIZJ = c74402w0;
        c252709vu.LIZIZ(c235929Ns);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "tt_mdp_page");
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, scene);
        c188727au.LJIIIZ("clip_id", str);
        FMX.LJIIL("work_with_artist_show", c188727au.LIZ);
    }

    @Override // X.OHA
    public final void LIZIZ(C252709vu c252709vu) {
        C74402w0 c74402w0;
        View LJI = c252709vu.LJI("rewarded_music");
        if (LJI instanceof C74402w0) {
            c74402w0 = (C74402w0) LJI;
        } else {
            c74402w0 = null;
        }
        this.LIZIZ = c74402w0;
        if (c74402w0 != null) {
            ViewGroup.LayoutParams layoutParams = c74402w0.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                layoutParams2.width = -2;
                layoutParams2.height = -2;
                c74402w0.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        C74402w0 c74402w02 = this.LIZIZ;
        if (c74402w02 != null) {
            c74402w02.setActionListener(new Au2S18S0200000_10(this, this.LIZJ, 1));
        }
    }

    @Override // X.OHA
    public final void LIZJ(int i) {
        int i2;
        C74402w0 c74402w0 = this.LIZIZ;
        if (c74402w0 != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZJ;
            int LIZIZ = C7MY.LIZIZ(40);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(100));
            musicDetailNavBarAssem.getClass();
            c74402w0.setAlpha(1.0f - MusicDetailNavBarAssem.M3(LIZIZ, LJJIIZ, i));
        }
        C74402w0 c74402w02 = this.LIZIZ;
        if (c74402w02 == null) {
            return;
        }
        if (o.LIZJ(Float.valueOf(c74402w02.getAlpha()), 0.0f)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        c74402w02.setVisibility(i2);
    }

    public OH8(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail) {
        o.LJIIIZ(musicDetail, "musicDetail");
        this.LIZJ = musicDetailNavBarAssem;
        this.LIZ = musicDetail;
    }
}
