package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Y8A extends F9E {
    public final CommentImageModel LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public long LJLZ;
    public int LJZ;
    public int LJZI;
    public long LJZL;
    public String LL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL), Long.valueOf(this.LJLJL), Long.valueOf(this.LJLJLJ), Long.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLL), Integer.valueOf(this.LJLLI), Integer.valueOf(this.LJLLILLLL), Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLL), Integer.valueOf(this.LJLLLL), Integer.valueOf(this.LJLLLLLL), Long.valueOf(this.LJLZ), Integer.valueOf(this.LJZ), Integer.valueOf(this.LJZI), Long.valueOf(this.LJZL), this.LL};
    }

    public final JSONObject LJJIII() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("compress_duration", this.LJLJI - this.LJLILLLLZI);
        jSONObject.put("auth_duration", this.LJLJJL - this.LJLJJI);
        jSONObject.put("upload_duration", this.LJLJL - this.LJLJJLL);
        jSONObject.put("post_duration", this.LJLJLLL - this.LJLJLJ);
        jSONObject.put("compress_status", this.LJLL);
        jSONObject.put("auth_status", this.LJLLI);
        jSONObject.put("upload_status", this.LJLLILLLL);
        jSONObject.put("post_status", this.LJLLJ);
        jSONObject.put("status", this.LJLLL);
        jSONObject.put("original_width", this.LJZ);
        jSONObject.put("original_height", this.LJZI);
        jSONObject.put("original_size", this.LJZL);
        jSONObject.put("original_format", this.LL);
        jSONObject.put("width", this.LJLLLL);
        jSONObject.put("height", this.LJLLLLLL);
        jSONObject.put("size", this.LJLZ);
        return jSONObject;
    }

    public Y8A(CommentImageModel imageModel) {
        o.LJIIIZ(imageModel, "imageModel");
        this.LJLIL = imageModel;
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0L;
        this.LJLJJI = 0L;
        this.LJLJJL = 0L;
        this.LJLJJLL = 0L;
        this.LJLJL = 0L;
        this.LJLJLJ = 0L;
        this.LJLJLLL = 0L;
        this.LJLL = 0;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = 0;
        this.LJLLLL = 0;
        this.LJLLLLLL = 0;
        this.LJLZ = 0L;
        this.LJZ = 0;
        this.LJZI = 0;
        this.LJZL = 0L;
        this.LL = "jpeg";
    }
}
