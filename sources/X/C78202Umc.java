package X;

import android.content.Context;
import android.util.SparseArray;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveDisableSVForConsumeLayerSetting;
import com.bytedance.gift.render.model.Effect;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Umc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78202Umc extends FrameLayout {
    public final J03 LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJI;
    public C78194UmU LJLJJL;
    public final C78210Umk LJLJJLL;
    public final C78201Umb LJLJL;
    public final C78211Uml LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    private final C78203Umd getMGiftPlayerLifecycleController() {
        return (C78203Umd) this.LJLJLLL.getValue();
    }

    private final float getFps() {
        InterfaceC78204Ume interfaceC78204Ume = getMGiftPlayerLifecycleController().LJFF;
        if (interfaceC78204Ume != null) {
            return interfaceC78204Ume.fps();
        }
        return -1.0f;
    }

    private final float getSourceFps() {
        InterfaceC78204Ume interfaceC78204Ume = getMGiftPlayerLifecycleController().LJFF;
        if (interfaceC78204Ume != null) {
            return interfaceC78204Ume.LIZJ();
        }
        return 0.0f;
    }

    public final void LIZJ() {
        if (getMGiftPlayerLifecycleController() != null) {
            InterfaceC78204Ume interfaceC78204Ume = getMGiftPlayerLifecycleController().LJFF;
            if (interfaceC78204Ume != null) {
                interfaceC78204Ume.stop();
            }
            getMGiftPlayerLifecycleController().LIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC78206Umg interfaceC78206Umg;
        super.onDetachedFromWindow();
        getMGiftPlayerLifecycleController().LIZ();
        C78194UmU c78194UmU = this.LJLJJL;
        if (c78194UmU != null) {
            interfaceC78206Umg = c78194UmU.LIZLLL;
        } else {
            interfaceC78206Umg = null;
        }
        this.LJLJJL = null;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJFF(EnumC78220Umu.ALPHA_PLAYER, new C78163Ulz(-27, (String) null, 6));
        }
    }

    public final C78165Um1 LIZ(C60382Yo c60382Yo) {
        String str;
        JSONObject put;
        C78165Um1 c78165Um1 = new C78165Um1();
        c78165Um1.LJFF = Math.max(0L, C32257ClJ.LIZLLL().LIZ() - this.LJLILLLLZI);
        long j = this.LJLILLLLZI;
        c78165Um1.LJI = j;
        c78165Um1.LJIIIIZZ = Math.max(0L, j - this.LJLJI);
        c78165Um1.LIZIZ = getFps();
        InterfaceC78204Ume interfaceC78204Ume = getMGiftPlayerLifecycleController().LJFF;
        if (interfaceC78204Ume != null) {
            str = interfaceC78204Ume.getPlayerType();
        } else {
            str = "unknown";
        }
        c78165Um1.LJIIIZ = str;
        c78165Um1.LIZJ = getSourceFps();
        if (c60382Yo == null || (put = c60382Yo.LIZ) == null) {
            put = new JSONObject().put("is_super_resolution_enable", 0);
            o.LJIIIIZZ(put, "JSONObject().put(\"is_super_resolution_enable\", 0)");
        }
        c78165Um1.LJIIJ = put;
        return c78165Um1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.Ume] */
    public final void LIZIZ(Object obj) {
        long j;
        C78163Ulz LJI;
        VX7 vx7;
        C78194UmU request = (C78194UmU) obj;
        o.LJIIIZ(request, "request");
        this.LJLJI = C32257ClJ.LIZLLL().LIZ();
        this.LJLJJL = request;
        setVisibility(0);
        request.LIZLLL.LIZLLL(EnumC78220Umu.ALPHA_PLAYER);
        this.LJLJJI = false;
        C78203Umd mGiftPlayerLifecycleController = getMGiftPlayerLifecycleController();
        mGiftPlayerLifecycleController.getClass();
        C32257ClJ.LIZ.removeCallbacks(mGiftPlayerLifecycleController.LJII);
        if (mGiftPlayerLifecycleController.LJFF == null && mGiftPlayerLifecycleController.LIZIZ != null) {
            C78169Um5 LIZ = C78169Um5.LIZ();
            int hashCode = mGiftPlayerLifecycleController.LIZIZ.hashCode();
            LIZ.getClass();
            SparseArray<InterfaceC78204Ume> sparseArray = C78169Um5.LIZIZ;
            InterfaceC78204Ume interfaceC78204Ume = sparseArray.get(hashCode);
            mGiftPlayerLifecycleController.LJFF = interfaceC78204Ume;
            if (interfaceC78204Ume == null && (mGiftPlayerLifecycleController.LIZIZ instanceof LifecycleOwner)) {
                C78169Um5 LIZ2 = C78169Um5.LIZ();
                int hashCode2 = mGiftPlayerLifecycleController.LIZIZ.hashCode();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) mGiftPlayerLifecycleController.LIZIZ;
                J03 j03 = mGiftPlayerLifecycleController.LIZ;
                int i = C78169Um5.LIZJ;
                if (hashCode2 == i) {
                    LIZ2.getClass();
                    if (sparseArray.get(i) != null) {
                        vx7 = sparseArray.get(C78169Um5.LIZJ);
                        mGiftPlayerLifecycleController.LJFF = vx7;
                    }
                } else {
                    LIZ2.getClass();
                }
                C78169Um5.LIZJ = hashCode2;
                VX7 vx72 = new VX7(LIZ2.LIZ, j03);
                vx72.LJIIIZ(lifecycleOwner);
                if (C32257ClJ.LIZIZ().LJIILIIL == 2 && !LiveDisableSVForConsumeLayerSetting.INSTANCE.inLayer()) {
                    vx72.LJIIJ(1);
                }
                sparseArray.put(hashCode2, vx72);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("create new player ");
                LIZ3.append(hashCode2);
                C32444CoK.LIZLLL("GiftCtlManager", X1D.LIZIZ(LIZ3));
                vx7 = vx72;
                mGiftPlayerLifecycleController.LJFF = vx7;
            }
            InterfaceC78204Ume interfaceC78204Ume2 = mGiftPlayerLifecycleController.LJFF;
            if (interfaceC78204Ume2 != null) {
                interfaceC78204Ume2.LJ(mGiftPlayerLifecycleController.LIZLLL);
                mGiftPlayerLifecycleController.LJFF.LIZ(mGiftPlayerLifecycleController.LJ);
                mGiftPlayerLifecycleController.LJFF.attachAlphaView(mGiftPlayerLifecycleController.LIZJ);
            }
            C32444CoK.LIZLLL("GiftCtlManager", "play gift video fail, because player is null.");
            LJI = new C78163Ulz(-20, "play gift video fail, because player is null.", (Throwable) null);
            request.LIZLLL.LJFF(EnumC78220Umu.ALPHA_PLAYER, LJI);
        }
        InterfaceC78204Ume interfaceC78204Ume3 = mGiftPlayerLifecycleController.LJFF;
        if (interfaceC78204Ume3 != null) {
            C78161Ulx c78161Ulx = request.LJ;
            c78161Ulx.getClass();
            C32257ClJ.LIZLLL().LIZ();
            EnumC78167Um3 enumC78167Um3 = EnumC78167Um3.playcontroller_start;
            C78160Ulw c78160Ulw = c78161Ulx.LIZ;
            long j2 = 0;
            if (c78160Ulw != null) {
                j = c78160Ulw.LIZ;
            } else {
                j = 0;
            }
            Effect effect = c78161Ulx.LIZIZ;
            C78168Um4.LIZ(enumC78167Um3, j, effect.giftId, effect.LIZ().id);
            List<? extends C77383UYp> list = request.LJI;
            if (list != null) {
                for (C77383UYp c77383UYp : list) {
                    MaskSrc maskSrc = new MaskSrc();
                    maskSrc.setBitmap(c77383UYp.LIZJ);
                    maskSrc.setText(null);
                    maskSrc.setName(c77383UYp.LIZ);
                    maskSrc.setType(c77383UYp.LIZIZ);
                    if (maskSrc.getType() == 0) {
                        interfaceC78204Ume3.LJFF(maskSrc.getTextSize(), maskSrc.getName(), maskSrc.isBold(), maskSrc.getText(), maskSrc.getTextColor());
                    } else if (maskSrc.getType() == 1) {
                        interfaceC78204Ume3.LIZLLL(maskSrc.getBitmap(), maskSrc.getName());
                    }
                }
            }
            C78160Ulw c78160Ulw2 = request.LJ.LIZ;
            if (c78160Ulw2 != null) {
                j2 = c78160Ulw2.LIZ;
            }
            LJI = interfaceC78204Ume3.LJI(j2, request.LJFF);
            if (LJI == null) {
                return;
            }
            request.LIZLLL.LJFF(EnumC78220Umu.ALPHA_PLAYER, LJI);
        }
        C32444CoK.LIZLLL("GiftCtlManager", "play gift video fail, because player is null.");
        LJI = new C78163Ulz(-20, "play gift video fail, because player is null.", (Throwable) null);
        request.LIZLLL.LJFF(EnumC78220Umu.ALPHA_PLAYER, LJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78202Umc(Context context, J03 j03) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = j03;
        this.LJLJJLL = C78210Umk.LIZ;
        this.LJLJL = new C78201Umb(this);
        this.LJLJLJ = C78211Uml.LIZ;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0200000_13(context, this, 80));
        setLayoutDirection(0);
    }
}
