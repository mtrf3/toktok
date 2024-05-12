package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.shortvideo.edit.sharestory.BlackMusicCardParam;
import com.ss.android.ugc.aweme.shortvideo.edit.sharestory.NonBlackMusicCardParam;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.WeV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82795WeV extends AbstractC85293Wj {
    public final /* synthetic */ XJL<C76800UCe> LJLIL;
    public final /* synthetic */ C68322mC<MusicShareStoryData> LJLILLLLZI;
    public final /* synthetic */ C5VH LJLJI;
    public final /* synthetic */ C43579H8l LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;

    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData] */
    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        int i;
        Integer LIZJ;
        if (bitmap == null) {
            XJL<C76800UCe> xjl = this.LJLIL;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
        C68322mC<MusicShareStoryData> c68322mC = this.LJLILLLLZI;
        if (bitmap != null) {
            Integer num = -1;
            int i2 = -16777216;
            Integer num2 = null;
            if (C00F.LIZ(31744, 1, "music_share_story_music_card_style", true) == 1) {
                FFL LJIIIZ = FFL.LJIIIZ();
                BlackMusicCardParam blackMusicCardParam = C82798WeY.LIZ;
                LJIIIZ.getClass();
                BlackMusicCardParam blackMusicCardParam2 = (BlackMusicCardParam) FFL.LJIJ(true, "black_music_card_style", 31744, BlackMusicCardParam.class, blackMusicCardParam);
                if (blackMusicCardParam2 != null) {
                    blackMusicCardParam = blackMusicCardParam2;
                }
                C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve(bitmap, null));
                LIZ.LJI(blackMusicCardParam.getBgTolerance());
                LIZ.LJFF(blackMusicCardParam.getBgChromaMin(), blackMusicCardParam.getBgChromaMax(), blackMusicCardParam.getBgLMin(), blackMusicCardParam.getBgLMax(), 0.0f);
                LIZ.LJII(blackMusicCardParam.getBgLAddition());
                Integer LIZJ2 = LIZ.LIZJ();
                if (LIZJ2 != null) {
                    i = LIZJ2.intValue();
                } else {
                    i = -16777216;
                }
                Integer LIZLLL = LIZ.LIZLLL();
                if (LIZLLL != null) {
                    i2 = LIZLLL.intValue();
                }
                LIZ.LJI(blackMusicCardParam.getAudioTolerance());
                LIZ.LJFF(blackMusicCardParam.getAudioChromaMin(), blackMusicCardParam.getAudioChromaMax(), blackMusicCardParam.getAudioLMin(), blackMusicCardParam.getAudioLMax(), 0.0f);
                Integer LIZJ3 = LIZ.LIZJ();
                if (LIZJ3 != null) {
                    num = LIZJ3;
                }
                LIZJ = num;
            } else {
                FFL LJIIIZ2 = FFL.LJIIIZ();
                NonBlackMusicCardParam nonBlackMusicCardParam = C82799WeZ.LIZ;
                LJIIIZ2.getClass();
                NonBlackMusicCardParam nonBlackMusicCardParam2 = (NonBlackMusicCardParam) FFL.LJIJ(true, "no_black_music_card_style", 31744, NonBlackMusicCardParam.class, nonBlackMusicCardParam);
                if (nonBlackMusicCardParam2 != null) {
                    nonBlackMusicCardParam = nonBlackMusicCardParam2;
                }
                FlyMainColor flyMainColor = FlyMainColor.LIZ;
                C81154Vt8 LIZ2 = flyMainColor.LIZ(new C23220ve(bitmap, null));
                LIZ2.LJI(nonBlackMusicCardParam.getBgTolerance());
                LIZ2.LJFF(nonBlackMusicCardParam.getBgChromaMin(), nonBlackMusicCardParam.getBgChromaMax(), nonBlackMusicCardParam.getBgLMin(), nonBlackMusicCardParam.getBgLMax(), 0.0f);
                LIZ2.LJII(nonBlackMusicCardParam.getBgLAddition());
                Integer LIZJ4 = LIZ2.LIZJ();
                if (LIZJ4 != null) {
                    i = LIZJ4.intValue();
                } else {
                    i = -16777216;
                }
                Integer LIZLLL2 = LIZ2.LIZLLL();
                if (LIZLLL2 != null) {
                    i2 = LIZLLL2.intValue();
                }
                float[] fArr = new float[3];
                Color.colorToHSV(i, fArr);
                Integer valueOf = Integer.valueOf(Color.HSVToColor(new float[]{fArr[0], fArr[1], nonBlackMusicCardParam.getCardL()}));
                C81154Vt8 LIZ3 = flyMainColor.LIZ(new C23220ve(bitmap, null));
                LIZ3.LJI(nonBlackMusicCardParam.getAudioTolerance());
                LIZ3.LJFF(nonBlackMusicCardParam.getAudioChromaMin(), nonBlackMusicCardParam.getAudioChromaMax(), nonBlackMusicCardParam.getAudioLMin(), nonBlackMusicCardParam.getAudioLMax(), 0.0f);
                LIZJ = LIZ3.LIZJ();
                if (LIZJ == null) {
                    LIZJ = valueOf;
                }
                num2 = valueOf;
            }
            c68322mC.element = new MusicShareStoryData(null, null, i, i2, num2, num, LIZJ, null, null, 387, null);
            C5VH c5vh = this.LJLJI;
            OSZ<Integer, Integer> osz = new OSZ<>(Integer.valueOf(this.LJLILLLLZI.element.getBgStartColor()), Integer.valueOf(this.LJLILLLLZI.element.getBgEndColor()));
            c5vh.getClass();
            c5vh.LIZIZ = osz;
            InterfaceC43072GvM LJ = C62850Ola.LJ();
            CreativeInfo LIZ4 = this.LJLJJI.LIZ();
            EnumC43649HBd enumC43649HBd = EnumC43649HBd.SHARE_T0_STORY;
            String LIZLLL3 = C43073GvN.LIZLLL(LJ, LIZ4, enumC43649HBd, null, false, 12);
            C68322mC<String> c68322mC2 = this.LJLJJL;
            ?? path = new File(LIZLLL3, "music_cover.jpg").getPath();
            o.LJIIIIZZ(path, "File(dir, \"music_cover.jpg\").path");
            c68322mC2.element = path;
            C44729Hgz.LJJJJLI(bitmap, this.LJLJJL.element, Bitmap.CompressFormat.JPEG, 4);
            String filePath = new File(C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), this.LJLJJI.LIZ(), enumC43649HBd, null, false, 12), "source.png").getPath();
            Bitmap bitmap2 = Bitmap.createBitmap(540, 960, Bitmap.Config.ARGB_8888);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 960.0f, this.LJLILLLLZI.element.getBgStartColor(), this.LJLILLLLZI.element.getBgEndColor(), Shader.TileMode.CLAMP);
            Canvas canvas = new Canvas(bitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(linearGradient);
            canvas.drawRect(0.0f, 0.0f, 540.0f, 960.0f, paint);
            o.LJIIIIZZ(bitmap2, "bitmap2");
            o.LJIIIIZZ(filePath, "filePath");
            C44729Hgz.LJJJJLI(bitmap2, filePath, Bitmap.CompressFormat.PNG, 4);
            C5VH c5vh2 = this.LJLJI;
            c5vh2.getClass();
            c5vh2.LIZ = filePath;
            XJL<C76800UCe> xjl2 = this.LJLIL;
            C76800UCe c76800UCe2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe2);
            xjl2.resumeWith(c76800UCe2);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        XJL<C76800UCe> xjl = this.LJLIL;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    public C82795WeV(XKS xks, C68322mC c68322mC, C5VH c5vh, C43579H8l c43579H8l, C68322mC c68322mC2) {
        this.LJLIL = xks;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c5vh;
        this.LJLJJI = c43579H8l;
        this.LJLJJL = c68322mC2;
    }
}
