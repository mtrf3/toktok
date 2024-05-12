package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.TCd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74251TCd extends AbstractViewOnClickListenerC74256TCi {
    public final TEF LJLL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition;
        o.LJIIIZ(view, "view");
        DATA data = this.LJLIL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        java.util.Map<String, List<Integer>> LJJIIJZLJL = this.LJLJLJ.LJJIIJZLJL();
        this.LJLJLJ.LJJJJZ();
        Integer num = null;
        List<Integer> list = LJJIIJZLJL.get(null);
        int i = 0;
        if (list != null) {
            ListIterator<Integer> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Integer previous = listIterator.previous();
                if (adapterPosition > previous.intValue()) {
                    num = previous;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null) {
                i = num2.intValue();
            }
        }
        this.LJLJLLL.fX(new TE8(data, adapterPosition - i, this.LJLILLLLZI, false, false, null, null, null, null, 1008));
    }

    @Override // X.C73365Sqn
    public final void L(int i, Object obj) {
        List<String> urlList;
        String str;
        Effect data = (Effect) obj;
        o.LJIIIZ(data, "data");
        this.LJLJL.setText(data.getName());
        TextView textView = this.LJLJL.getTextView();
        if (C78866UxK.LJJJJZI(this.LJLJLJ, data) && !V3N.LJIILLIIL(data)) {
            if (textView instanceof C74253TCf) {
                ((C74253TCf) textView).setMarqueeEnable(true);
            }
        } else if (textView instanceof C74253TCf) {
            ((C74253TCf) textView).setMarqueeEnable(false);
        }
        UrlModel iconUrl = data.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
            C51029K0z.LJFF(this.LJLJL, str);
        }
        this.LJLL.LIZ(data, new C76857UEj());
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setContentDescription(data.getName());
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi, X.C73365Sqn
    public final /* bridge */ /* synthetic */ void M(Effect effect, TEA tea, Integer num) {
        M(effect, tea, num);
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi
    /* renamed from: P */
    public final void M(Effect data, TEA state, Integer num) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        T(state, num);
        if (C78866UxK.LJJJJZI(this.LJLJLJ, data)) {
            Q(true);
        } else {
            Q(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74251TCd(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel) {
        super(itemView, stickerImageView, stickerDataManager, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLL = tagHandler;
    }
}
