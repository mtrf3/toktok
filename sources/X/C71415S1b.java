package X;

import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import fjb.a;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.anchor.videoanchor.PoiAnchorView$tryExpandTagLayout$1$1$onAnimationEnd$1$1", f = "PoiAnchorView.kt", l = {534}, m = "invokeSuspend")
/* renamed from: X.S1b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71415S1b extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71417S1d LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71415S1b(C71417S1d c71417S1d, int i, InterfaceC67352kd<? super C71415S1b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71417S1d;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71415S1b(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Aweme LJJLL;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo videoAnchor;
        String trackInfo;
        TuxIconView tuxIconView;
        ViewGroup.LayoutParams layoutParams;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C71417S1d c71417S1d = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c71417S1d.LJIIJJI(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C71417S1d c71417S1d2 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        int tagDividerWidth = c71417S1d2.LL.getTagDividerWidth() + c71417S1d2.LL.getExpectTag2Width() + c71417S1d2.LL.getExpectTag1Width();
        TuxIconView tuxIconView2 = c71417S1d2.LJLZ;
        int i3 = 0;
        if (tuxIconView2 != null && tuxIconView2.getVisibility() == 0 && (tuxIconView = c71417S1d2.LJLZ) != null && (layoutParams = tuxIconView.getLayoutParams()) != null) {
            i3 = layoutParams.width;
        }
        c71417S1d2.LJJJJZI(c71417S1d2.LL.getExpectTitleWidth(), c71417S1d2.LL.getExpectSuffixWidth(), tagDividerWidth + i3, c71417S1d2.LL.getTitleWidth(), c71417S1d2.LL.getSuffixWidth(), i2);
        InterfaceC44105HSr interfaceC44105HSr = c71417S1d2.LJLJJLL;
        String str2 = null;
        if (interfaceC44105HSr != null) {
            str = interfaceC44105HSr.LJJLIIIJLLLLLLLZ();
        } else {
            str = null;
        }
        if (!C78857UxB.LJJJIL(str) || str == null) {
            str = "video_anchor";
        }
        InterfaceC44105HSr interfaceC44105HSr2 = c71417S1d2.LJLJJLL;
        if (interfaceC44105HSr2 != null) {
            str2 = interfaceC44105HSr2.LJJLJLI();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        InterfaceC44105HSr interfaceC44105HSr3 = c71417S1d2.LJLJJLL;
        if (interfaceC44105HSr3 != null && (LJJLL = interfaceC44105HSr3.LJJLL()) != null && (poiDataStruct = LJJLL.getPoiDataStruct()) != null && (videoAnchor = poiDataStruct.getVideoAnchor()) != null && (trackInfo = videoAnchor.getTrackInfo()) != null) {
            str3 = trackInfo;
        }
        C188727au c188727au = new C188727au();
        if (c71417S1d2.LJIILJJIL()) {
            long j = c71417S1d2.LLIIII;
            if (j != -1 && c71417S1d2.LLII != 0) {
                c188727au.LJ(j, "expand_duration");
            }
            if (C78685UuP.LJJJZ(c71417S1d2.LLIFFJFJJ)) {
                c188727au.LJI("expand_type", c71417S1d2.LLIFFJFJJ);
            }
        }
        C191557fT c191557fT = c71417S1d2.LJLJJL;
        c191557fT.getClass();
        PoiAnchorData poiAnchorData = c191557fT.LJLILLLLZI;
        AqS169S0100000_3 appendRateBlock = c191557fT.LJLLILLLL;
        o.LJIIIZ(appendRateBlock, "appendRateBlock");
        C190827eI c190827eI = PoiAnchorData.Companion;
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", str2);
        c188727au2.LJIIIZ("enter_method", str);
        c188727au2.LJIIIIZZ(C78966Uyw.LJJJLZIJ(str3));
        c188727au2.LJIIIIZZ(c188727au.LIZ);
        c190827eI.getClass();
        C190827eI.LIZ(c188727au2, poiAnchorData);
        appendRateBlock.invoke(c188727au2);
        FMX.LJIIL("multi_anchor_entrance_expand", c188727au2.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
