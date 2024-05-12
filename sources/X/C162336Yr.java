package X;

import Y.ARunnableS13S0300000_2;
import android.graphics.Bitmap;
import android.util.Pair;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.exit.RecordExitComponent$realSaveDraft$1$1", f = "RecordExitComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162336Yr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ C46065I6b LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C162336Yr(VideoPublishEditModel videoPublishEditModel, C46065I6b c46065I6b, InterfaceC67352kd<? super C162336Yr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = c46065I6b;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C162336Yr(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        C141335gf.LIZJ(obj);
        final VideoPublishEditModel model = this.LJLIL;
        o.LJIIIIZZ(model, "model");
        C46065I6b c46065I6b = this.LJLILLLLZI;
        final ActivityC45651qj activity = c46065I6b.LJLLI;
        final AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(this.LJLIL, c46065I6b, 61);
        o.LJIIIZ(activity, "activity");
        if (model.isMultiVideoEdit()) {
            MultiEditVideoRecordData curMultiEditVideoRecordData = model.getCurMultiEditVideoRecordData();
            o.LJIIIIZZ(curMultiEditVideoRecordData, "editModel.curMultiEditVideoRecordData");
            VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
            Pair<Integer, Integer> playInOutTime = model.getCurMultiEditVideoRecordData().getPlayInOutTime();
            o.LJIIIIZZ(playInOutTime, "editModel.curMultiEditVi…oRecordData.playInOutTime");
            LJIIJJI.setTimeRange(((Number) playInOutTime.first).intValue() * 1000, ((Number) playInOutTime.second).intValue() * 1000);
            int i2 = (int) (model.mVideoCoverStartTm * 1000);
            if (model.isUseTimeReverseEffect()) {
                int intValue = ((Number) playInOutTime.second).intValue();
                Object obj2 = playInOutTime.first;
                o.LJIIIIZZ(obj2, "playPair.first");
                i = (intValue - ((Number) obj2).intValue()) - i2;
            } else {
                i = i2;
            }
            VEUtils.getVideoThumb(LJIIJJI, i, -1, -1, false, new P5A() { // from class: X.6Ys
                @Override // X.P5A
                public final boolean processFrame(ByteBuffer frame, int i3, int i4, int i5) {
                    o.LJIIIZ(frame, "frame");
                    Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(frame.position(0));
                    Bitmap LIZJ = OUR.LIZJ(model, createBitmap);
                    new C1M5(activity.getResources(), LIZJ).LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                    ExecutorC149205tM.LJLILLLLZI.execute(new ARunnableS13S0300000_2(model, LIZJ, aqS149S0200000_2, 13));
                    return false;
                }
            });
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(model.getEffectList());
            EffectPointModel timeEffect = model.getTimeEffect();
            if (timeEffect != null) {
                arrayList.add(timeEffect);
                z = o.LJ(timeEffect.getKey(), "1");
            } else {
                z = false;
            }
            C43679HCh.LIZ(arrayList, H7R.LIZLLL(model, C44172HVg.LJJ.LJIILL().LJI()).getFilterFolder(), model.mSelectedFilterIntensity, (int) (model.mVideoCoverStartTm * 1000), z, model.getPreviewInfo(), model.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.6YW
                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i3) {
                    H7B.LIZ("DraftCoverHelper -> get video cover failed");
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    o.LJIIIZ(bitmap, "bitmap");
                    Bitmap LIZJ = OUR.LIZJ(model, bitmap);
                    new C1M5(activity.getResources(), LIZJ).LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                    C43679HCh.LIZIZ(LIZJ, null, model.getVideoCoverPath());
                }
            });
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
