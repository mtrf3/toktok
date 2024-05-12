package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.util.NinePatchUtil$loadNinePatchImage$1", f = "NinePatchUtil.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "invokeSuspend")
/* renamed from: X.Cby, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31678Cby extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC31680Cc0 LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31678Cby(View view, boolean z, int i, InterfaceC31680Cc0 interfaceC31680Cc0, String str, InterfaceC67352kd<? super C31678Cby> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = view;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC31680Cc0;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C31678Cby(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int density;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        Rect rect = null;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            XIA xia = C78613UtF.LIZJ;
            C31679Cbz c31679Cbz = new C31679Cbz(this.LJLJJLL, this.LJLJJL, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(xia, c31679Cbz, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Bitmap bitmap = (Bitmap) obj2;
        View view = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        int i2 = this.LJLJJI;
        InterfaceC31680Cc0 interfaceC31680Cc0 = this.LJLJJL;
        if (bitmap != null) {
            byte[] ninePatchChunk = bitmap.getNinePatchChunk();
            if (ninePatchChunk != null) {
                ByteBuffer order = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
                if (order.get() != 0) {
                    order.get();
                    order.get();
                    order.get();
                    order.getInt();
                    order.getInt();
                    rect = new Rect();
                    rect.left = order.getInt();
                    rect.right = order.getInt();
                    rect.top = order.getInt();
                    rect.bottom = order.getInt();
                }
            }
            if (bitmap != null) {
                if (bitmap.getNinePatchChunk() != null && rect != null) {
                    NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(view.getContext().getResources(), bitmap, bitmap.getNinePatchChunk(), rect, null);
                    if (i2 > 0 && bitmap.getDensity() > 0 && bitmap.getHeight() > 0 && (density = (bitmap.getDensity() * i2) / bitmap.getHeight()) > 0 && density != 1) {
                        ninePatchDrawable.setTargetDensity(density);
                    }
                    ninePatchDrawable.setAutoMirrored(z);
                    view.setBackground(ninePatchDrawable);
                    if (z && C90193gN.LIZIZ(view.getContext())) {
                        view.setPadding(rect.right, rect.top, rect.left, rect.bottom);
                    } else {
                        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    if (interfaceC31680Cc0 != null) {
                        interfaceC31680Cc0.onSuccess();
                    }
                } else if (interfaceC31680Cc0 != null) {
                    interfaceC31680Cc0.onFailed(new Throwable("no ninepatch chunk found in bitmap"));
                }
                return C76800UCe.LIZ;
            }
        }
        if (interfaceC31680Cc0 != null) {
            interfaceC31680Cc0.onFailed(new Throwable("downloaded bitmap is null"));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
