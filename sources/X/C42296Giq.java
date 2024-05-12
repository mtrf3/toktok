package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.keva.Keva;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ExtractMusicChosenResultImpl$onChosenResult$extractTask$1$1", f = "ExtractMusicChosenResultImpl.kt", l = {141}, m = "invokeSuspend")
/* renamed from: X.Giq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42296Giq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C42294Gio LJLJI;
    public final /* synthetic */ MediaModel LJLJJI;
    public final /* synthetic */ Intent LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42296Giq(C42294Gio c42294Gio, MediaModel mediaModel, Intent intent, InterfaceC67352kd<? super C42296Giq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c42294Gio;
        this.LJLJJI = mediaModel;
        this.LJLJJL = intent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42296Giq(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        File tmpAudioFile;
        W5A w5a;
        int width;
        String LIZIZ;
        Bundle bundle;
        String str;
        String string;
        Integer valueOf;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                tmpAudioFile = (File) this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            this.LJLJI.LIZIZ = System.currentTimeMillis();
            String str2 = this.LJLJJI.fileLocalUriPath;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI.LIZLLL.getPath());
            String str3 = File.separator;
            LIZ.append(str3);
            LIZ.append("tmp");
            String fileBestStreamAudio = VEUtils.getFileBestStreamAudio(str2, X1D.LIZIZ(LIZ));
            if (fileBestStreamAudio == null) {
                this.LJLJI.LJI(1);
                return C76800UCe.LIZ;
            }
            tmpAudioFile = new File(fileBestStreamAudio);
            if (!tmpAudioFile.exists()) {
                this.LJLJI.LJI(2);
                return C76800UCe.LIZ;
            }
            C42294Gio c42294Gio = this.LJLJI;
            MediaModel mediaModel = this.LJLJJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLJI.LIZLLL.getPath());
            LIZ2.append(str3);
            LIZ2.append("tmp");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            this.LJLIL = tmpAudioFile;
            this.LJLILLLLZI = 1;
            c42294Gio.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            W5P LIZLLL = W5P.LIZLLL(C44694HgQ.LJIIIIZZ(mediaModel.fileLocalUriPath));
            LIZLLL.LJIIL = true;
            int[] iArr = C42294Gio.LJII;
            LIZLLL.LIZJ = new C79238V7y(iArr[0], iArr[1]);
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
            imageDecodeOptionsBuilder.getClass();
            LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
            W4W<C81392Vwy<W5A>> LJ = W5I.LIZ().LJ(LIZLLL.LIZ(), c42294Gio.LIZ);
            File file = new File(LIZIZ2);
            try {
                C81392Vwy c81392Vwy = (C81392Vwy) C81702W4s.LIZIZ(LJ);
                if (c81392Vwy != null) {
                    w5a = (W5A) c81392Vwy.LJI();
                } else {
                    w5a = null;
                }
                o.LJII(w5a, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                Bitmap bitmap = ((W5B) w5a).getUnderlyingBitmap();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    o.LJIIIIZZ(bitmap, "bitmap");
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = bitmap.getHeight();
                    } else {
                        width = bitmap.getWidth();
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width) / 2, (bitmap.getHeight() - width) / 2, width, width);
                    o.LJIIIIZZ(createBitmap, "createBitmap(\n          …        length,\n        )");
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                    AnonymousClass636.LJFF(bufferedOutputStream, null);
                    C3C5.m7constructorimpl(file);
                    c84654XKg.resumeWith(file);
                } finally {
                }
            } catch (Exception e) {
                H78.LJ(e);
            }
            obj2 = c84654XKg.LIZ();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        File tmpThumbFile = (File) obj2;
        C6QQ.LIZ(new AqS157S0100000_7(this.LJLJI, 481));
        C42294Gio c42294Gio2 = this.LJLJI;
        c42294Gio2.getClass();
        o.LJIIIZ(tmpAudioFile, "tmpAudioFile");
        o.LJIIIZ(tmpThumbFile, "tmpThumbFile");
        String date = BDDateFormat.LIZJ(new BDDateFormat("YYYYMMDD"), System.currentTimeMillis());
        o.LJIIIZ(date, "date");
        Object value = c42294Gio2.LJI.getValue();
        o.LJIIIIZZ(value, "<get-data>(...)");
        int i2 = ((Keva) value).getInt(date, -1);
        if (i2 == -1) {
            File[] listFiles = c42294Gio2.LJ.listFiles(new C42297Gir(date));
            if (listFiles != null && (valueOf = Integer.valueOf(listFiles.length)) != null) {
                i2 = valueOf.intValue() + 1;
            } else {
                i2 = 1;
            }
        }
        String LIZIZ3 = Q8U.LIZIZ(new Object[]{Integer.valueOf(i2)}, 1, "- %02d -", "format(format, *args)");
        String string2 = c42294Gio2.LIZ.getString(R.string.bmq);
        o.LJIIIIZZ(string2, "activity.getString(R.str…g.allowaddsound_uploaded)");
        String LIZIZ4 = Q8U.LIZIZ(new Object[]{string2, LIZIZ3, date}, 3, "%s %s %s", "format(format, *args)");
        if (OR7.LLLIILIL(tmpAudioFile).length() == 0) {
            z = true;
        }
        String str4 = "";
        if (z) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append('.');
            LIZ3.append(OR7.LLLIILIL(tmpAudioFile));
            LIZIZ = X1D.LIZIZ(LIZ3);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(c42294Gio2.LJ.getPath());
        String str5 = File.separator;
        File file2 = new File(C025908h.LIZIZ(LIZ4, str5, LIZIZ4, LIZIZ, LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(c42294Gio2.LJFF.getPath());
        LIZ5.append(str5);
        LIZ5.append(LIZIZ4);
        LIZ5.append(".jpg");
        OSZ osz = new OSZ(file2, new File(X1D.LIZIZ(LIZ5)));
        if (!((File) osz.getFirst()).exists()) {
            try {
                WEC.LIZIZ(tmpAudioFile, (File) osz.getFirst());
                WEC.LIZIZ(tmpThumbFile, (File) osz.getSecond());
                Object value2 = c42294Gio2.LJI.getValue();
                o.LJIIIIZZ(value2, "<get-data>(...)");
                ((Keva) value2).clear();
                Object value3 = c42294Gio2.LJI.getValue();
                o.LJIIIIZZ(value3, "<get-data>(...)");
                ((Keva) value3).storeInt(date, i2 + 1);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("extract success, time:");
                LIZ6.append(System.currentTimeMillis() - c42294Gio2.LIZIZ);
                LIZ6.append(", size: ");
                long j = 1024;
                LIZ6.append(((File) osz.getFirst()).length() / j);
                LIZ6.append("kb ");
                LIZ6.append(((File) osz.getSecond()).length() / j);
                LIZ6.append("kb");
                H78.LIZIZ("EXTRACT_MUSIC", X1D.LIZIZ(LIZ6));
                C42294Gio c42294Gio3 = this.LJLJI;
                MediaModel mediaModel2 = this.LJLJJI;
                Intent intent = this.LJLJJL;
                c42294Gio3.getClass();
                C6QQ.LIZ(new AqS157S0100000_7(c42294Gio3, 485));
                long j2 = mediaModel2.duration;
                long currentTimeMillis = System.currentTimeMillis() - c42294Gio3.LIZIZ;
                Bundle LIZLLL2 = C60903NvH.LJIIJJI().LJIL().LIZLLL(c42294Gio3.LIZ);
                if (LIZLLL2 != null) {
                    bundle = LIZLLL2.getBundle("extra_log_info_map");
                } else {
                    bundle = null;
                }
                if (bundle == null || (str = bundle.getString("creation_id")) == null) {
                    str = "";
                }
                if (bundle != null && (string = bundle.getString("shoot_way")) != null) {
                    str4 = string;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("creation_id", str);
                c188727au.LJIIIZ("shoot_way", str4);
                c188727au.LJ(j2, "content_duration");
                c188727au.LJ(currentTimeMillis, "duration");
                c188727au.LJIIIZ("upload_method", "click");
                FMX.LJIIL("upload_sound_from_video", c188727au.LIZ);
                intent.putExtra("extract_music_path", ((File) osz.getFirst()).getPath());
                c42294Gio3.LIZ.setResult(101, intent);
                c42294Gio3.LIZ.finish();
                long j3 = 1024;
                C42294Gio.LJFF(System.currentTimeMillis() - c42294Gio3.LIZIZ, ((File) osz.getFirst()).length() / j3, true, 0, ((File) osz.getSecond()).length() / j3);
                return C76800UCe.LIZ;
            } catch (C42298Gis e2) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("extract failed: ");
                C16880lQ.LLLLIIL(e2);
                LIZ7.append(C76800UCe.LIZ);
                H78.LIZIZ("EXTRACT_MUSIC", X1D.LIZIZ(LIZ7));
                C16880lQ.LLLZZIL((File) osz.getFirst());
                C16880lQ.LLLZZIL((File) osz.getSecond());
            }
        }
        this.LJLJI.LJI(3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
