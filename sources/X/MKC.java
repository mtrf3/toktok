package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class MKC extends AbstractC54946LhO implements Observer<C207668Da> {
    public C135155Sd LJLJJI;
    public boolean LJLJJL;

    @Override // X.AbstractC54946LhO
    public final String LIZIZ() {
        return "music_info";
    }

    @Override // X.AbstractC54946LhO
    public final void LJFF() {
    }

    @Override // X.AbstractC54946LhO
    public final java.util.Map<String, String> LIZLLL() {
        String str;
        Music music;
        HashMap hashMap = new HashMap();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMid()) == null) {
            str = "";
        }
        hashMap.put("music_id", str);
        return hashMap;
    }

    public MKC(View view) {
        super(view);
    }

    @Override // X.AbstractC54946LhO
    public final void LIZ(LV8 lv8) {
        String str;
        Music music;
        super.LIZ(lv8);
        this.LJLJJL = false;
        C135155Sd c135155Sd = this.LJLJJI;
        if (c135155Sd != null) {
            Aweme aweme = this.LJLILLLLZI;
            if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMusicName()) == null) {
                str = "";
            }
            c135155Sd.setText(str);
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LIZJ(View view) {
        if (view instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bfo, C16880lQ.LLZIL(viewGroup.getContext()), null);
            this.LJLJJI = (C135155Sd) LLLZIIL.findViewById(R.id.d8v);
            viewGroup.addView(LLLZIIL);
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LJ(DataCenter dataCenter) {
        dataCenter.iv0("start_animation", this, false);
        dataCenter.iv0("pause_animation", this, false);
        dataCenter.iv0("stop_animation", this, false);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        int i;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 != null) {
            String str = c207668Da2.LIZ;
            int hashCode = str.hashCode();
            if (hashCode != -463583257) {
                if (hashCode != -301890681) {
                    if (hashCode != 64864379 || !str.equals("pause_animation") || !this.LJLJJL) {
                        return;
                    }
                    C135155Sd c135155Sd = this.LJLJJI;
                    if (c135155Sd != null && c135155Sd.LJLJLJ != 1) {
                        c135155Sd.LJLJLJ = 1;
                        c135155Sd.invalidate();
                    }
                    this.LJLJJL = false;
                    return;
                }
                if (!str.equals("stop_animation") || !this.LJLJJL) {
                    return;
                }
                C135155Sd c135155Sd2 = this.LJLJJI;
                if (c135155Sd2 != null && c135155Sd2.LJLJLJ != 2) {
                    c135155Sd2.LJLJLJ = 2;
                    c135155Sd2.LJLJJLL = 0.0f;
                    c135155Sd2.LJLJLLL = 0L;
                    c135155Sd2.invalidate();
                }
                this.LJLJJL = false;
                return;
            }
            if (!str.equals("start_animation") || this.LJLJJL) {
                return;
            }
            C135155Sd c135155Sd3 = this.LJLJJI;
            if (c135155Sd3 != null && (i = c135155Sd3.LJLJLJ) != 0) {
                if (i == 1) {
                    c135155Sd3.LJLJLJ = 0;
                    c135155Sd3.invalidate();
                } else if (i == 2) {
                    c135155Sd3.LJLJJLL = 0.0f;
                    c135155Sd3.LJLJLLL = 0L;
                    c135155Sd3.LJLJLJ = 0;
                    c135155Sd3.invalidate();
                }
            }
            this.LJLJJL = true;
        }
    }
}
